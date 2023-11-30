/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main_pkg;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Feedback implements Serializable {
    private String feedbackName;
    private int feedbackNumber;
    private String feedbackText;

    public Feedback(String feedbackName, int feedbackNumber, String feedbackText) {
        this.feedbackName = feedbackName;
        this.feedbackNumber = feedbackNumber;
        this.feedbackText = feedbackText;
    }

    public String getFeedbackName() {
        return feedbackName;
    }

    public void setFeedbackName(String feedbackName) {
        this.feedbackName = feedbackName;
    }

    public int getFeedbackNumber() {
        return feedbackNumber;
    }

    public void setFeedbackNumber(int feedbackNumber) {
        this.feedbackNumber = feedbackNumber;
    }

    public String getFeedbackText() {
        return feedbackText;
    }

    public void setFeedbackText(String feedbackText) {
        this.feedbackText = feedbackText;
    }

    @Override
    public String toString() {
        return "Feedback{" + "feedbackName=" + feedbackName + ", feedbackNumber=" + feedbackNumber + ", feedbackText=" + feedbackText + '}';
    }
    
    
    
}
