/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main_pkg;

/**
 *
 * @author nirjharsikder
 */
public class User_1_AssociationMembers {
    
    private String userID,name,phoneNumber,eMail;

    public User_1_AssociationMembers(String userID, String name, String phoneNumber, String eMail) {
        this.userID = userID;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return "User_1_AssociationMembers{" + "userID=" + userID + ", name=" + name + ", phoneNumber=" + phoneNumber + ", eMail=" + eMail + '}';
    }
    
    
    
    
    
    
    
}
