/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imitation.events;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.firebase.cloud.FirestoreClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * This class contains all the necessary methods to interact with the Cloud
 * Firestore Database
 *
 * @author ryanzasas
 */
public class DatabaseOperations {

    private static Firestore db;

    public DatabaseOperations() {
        db = FirestoreClient.getFirestore();
    }

    /**
     * This method will retrieve all of the events from the Firestore DB and
     * return a list of Event Objects.
     *
     * @return List of events
     */
    public List<Event> getAllEvents() {
        List<Event> events = new ArrayList<>();
        try {
            // asynchronously retrieve all documents
            ApiFuture<QuerySnapshot> future = db.collection("events").get();
            List<QueryDocumentSnapshot> documents = future.get().getDocuments();
            for (QueryDocumentSnapshot document : documents) {
                if(document.exists()){
                   Event event = document.toObject(Event.class);
                   System.out.println(event);
                   events.add(event);
                }
            }

        } catch (InterruptedException ex) {
            Logger.getLogger(DatabaseOperations.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(DatabaseOperations.class.getName()).log(Level.SEVERE, null, ex);
        }

        return events;

    }

    public void addEvent(String evtName, String evtLoc, double evtPrice, User user) {

        // make a new map for userData
        Map<String, Object> userData = new HashMap<>();

        userData.put("uid", user.getUid());
        userData.put("email", user.getEmail());
        userData.put("firstName", user.getFirstName());
        userData.put("lastName", user.getLastName());

        // Add document data  with id "alovelace" using a hashmap
        Map<String, Object> data = new HashMap<>();
        data.put("name", evtName);
        data.put("location", evtLoc);
        data.put("price", evtPrice);
        data.put("host", userData);
        //asynchronously write data

        try {
            ApiFuture<DocumentReference> addedDocRef = db.collection("events").add(data);
            System.out.println("Added event  with ID: " + addedDocRef.get().getId());
            JOptionPane.showMessageDialog(null, "Thank you " + user.getFirstName(), "Your event has been saved", 1);

        } catch (InterruptedException ex) {
            Logger.getLogger(EventCreation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(EventCreation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public User getUserData(String uid) {
        User user = null;
        try {
            DocumentReference docRef = db.collection("users").document(uid);
            // asynchronously retrieve the document
            ApiFuture<DocumentSnapshot> future = docRef.get();
            // future.get() blocks on response
            DocumentSnapshot document = future.get();
            if (document.exists()) {
                user = document.toObject(User.class);
            } else {
                System.out.println("No such document!");
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(EventCreation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(EventCreation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }

}
