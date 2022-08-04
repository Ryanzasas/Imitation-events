/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imitation.events;

/**
 *
 * @author ryanzasas
 */
public class User {

    // Need to add code on register to save the uid of the user
    private String email;
    private String phoneNumber;
    private String uid;
    private String firstName;
    private String lastName;

    public User() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getUid() {
        return uid;
    }

}
