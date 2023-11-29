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
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author Asus
 */
public class User_8_WelcomePageController  implements Initializable{

    @FXML
    private Label userName;
    private Object currentStage;
    @FXML
    private ComboBox<String> selectgoalFxId;

    public void setUserFullName(String fullName) {
        userName.setText(fullName);
   
    }
             
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        selectgoalFxId.getItems().addAll("Patient Assignment","Patient Health Assessment","Patient Discharge Planning","Emergency Alerts","Patient Communication","Appointment Scheduling","Patient Education","Issue Report");
    }

    @FXML
    private void mainMenuButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void nextButtonOnClick(ActionEvent event) throws IOException {

    String a = selectgoalFxId.getValue().toString();
    Parent sceneA = null;

    if ("Patient Assignment".equals(a)) {
        sceneA = FXMLLoader.load(getClass().getResource("Patient_Assignment_Scene.fxml"));
    }
    if ("Patient Health Assessment".equals(a)) {
        sceneA = FXMLLoader.load(getClass().getResource("Patient_Health_Assessment_Scene.fxml"));
    }
    if ("Patient Discharge Planning".equals(a)) {
        sceneA = FXMLLoader.load(getClass().getResource("Patient_Discharge_Planning_Scene.fxml"));
    }
    if ("Emergency Alerts".equals(a)) {
        sceneA = FXMLLoader.load(getClass().getResource("Emergency_Alerts_Scene.fxml"));
    }
    if ("Patient Communication".equals(a)) {
        sceneA = FXMLLoader.load(getClass().getResource("Patient_Communication_Scene.fxml"));
    }
    if ("Appointment Scheduling".equals(a)) {
        sceneA = FXMLLoader.load(getClass().getResource("Appointment_Scheduling_Scene.fxml"));
    }
    if ("Issue Report".equals(a)) {
        sceneA = FXMLLoader.load(getClass().getResource("Issue_Report_Scene.fxml"));
    }

    // Default case if none of the conditions match
    if (sceneA == null) {
        sceneA = FXMLLoader.load(getClass().getResource("Patient_Education_Scene.fxml"));
    }

    Scene sceneJ = new Scene(sceneA);
    Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
    stg.setScene(sceneJ);
    stg.show();
}
}

