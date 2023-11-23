/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main_pkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author Asus
 */
public class User_7_WelcomePageController implements Initializable {

    @FXML
    private Label userName;
    private Object currentStage;

    public void setUserFullName(String fullName) {
        userName.setText(fullName);
   
    }
             
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void taskManagementOnClick(ActionEvent event) throws IOException {

    }
 
    @FXML
    private void CommunicationButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void taskStatusUpdatesOnClick(ActionEvent event) {
    }
    
    @FXML
    private void feedbackSubmissionOnClick(ActionEvent event) {
    }

    @FXML
    private void trainingMaterialsButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void qualityControlButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void emergencyButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void earningsButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void mainMenuButtonOnClick(ActionEvent event) {
    }   

}
