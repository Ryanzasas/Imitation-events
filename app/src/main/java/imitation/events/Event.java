/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imitation.events;

/**
 *
 * @author ryanzasas
 */
public class Event {
   private String location;
   private String name;
   private double price;
   // private static DateTime
   private User host;

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public User getHost() {
        return host;
    }
   
   // In order for firebase to automaticaly create this class based on incoming or outgoing data
   // we need to have an *EMPTY* constructor as well as getters for all of the attributes
   public Event(){
       
   }


   
   
}
