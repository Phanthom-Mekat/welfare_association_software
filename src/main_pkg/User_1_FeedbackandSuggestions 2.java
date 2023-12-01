/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main_pkg;

/**
 *
 * @author nirjharsikder
 */
public class User_1_FeedbackandSuggestions {
    private String userID,name,FeedbackOrSuggestion,Written;

    public User_1_FeedbackandSuggestions(String userID, String name, String FeedbackOrSuggestion, String Written) {
        this.userID = userID;
        this.name = name;
        this.FeedbackOrSuggestion = FeedbackOrSuggestion;
        this.Written = Written;
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

    public String getFeedbackOrSuggestion() {
        return FeedbackOrSuggestion;
    }

    public void setFeedbackOrSuggestion(String FeedbackOrSuggestion) {
        this.FeedbackOrSuggestion = FeedbackOrSuggestion;
    }

    public String getWritten() {
        return Written;
    }

    public void setWritten(String Written) {
        this.Written = Written;
    }

    @Override
    public String toString() {
        return "User_1_FeedbackandSuggestions{" + "userID=" + userID + ", name=" + name + ", FeedbackOrSuggestion=" + FeedbackOrSuggestion + ", Written=" + Written + '}';
    }
    
    
}
