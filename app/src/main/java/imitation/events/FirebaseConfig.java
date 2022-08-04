/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imitation.events;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ryanzasas
 */

public class FirebaseConfig {

    public void initFirebase() {
        FileInputStream serviceAccount = null;
        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        try {
            serviceAccount = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/imitation/events/credentials.json");
           
            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .setDatabaseUrl("https://imitation-events.firebaseio.com")
                    .build();
            
            FirebaseApp.initializeApp(options);
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FirebaseConfig.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FirebaseConfig.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                serviceAccount.close();
            } catch (IOException ex) {
                Logger.getLogger(FirebaseConfig.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}