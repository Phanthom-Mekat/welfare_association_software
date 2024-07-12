/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main_pkg;

/**
 *
 * @author nirjharsikder
 */
public class User_1_2_Registration {
        
    private String name,eventNames;
    private int extraGuest,registrationFee;

    public User_1_2_Registration(String name, String eventNames, int extraGuest, int registrationFee) {
        this.name = name;
        this.eventNames = eventNames;
        this.extraGuest = extraGuest;
        this.registrationFee = registrationFee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEventNames() {
        return eventNames;
    }

    public void setEventNames(String eventNames) {
        this.eventNames = eventNames;
    }

    public int getExtraGuest() {
        return extraGuest;
    }

    public void setExtraGuest(int extraGuest) {
        this.extraGuest = extraGuest;
    }

    public int getRegistrationFee() {
        return registrationFee;
    }

    public void setRegistrationFee(int registrationFee) {
        this.registrationFee = registrationFee;
    }

    @Override
    public String toString() {
        return "User_1_2_Registration{" + "name=" + name + ", eventNames=" + eventNames + ", extraGuest=" + extraGuest + ", registrationFee=" + registrationFee + '}';
    }
    
    
    
    
    
    
    
}
