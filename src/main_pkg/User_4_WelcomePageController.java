/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
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
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DCL
 */
public class User_4_WelcomePageController implements Initializable {

    @FXML
    private Label userName;
    @FXML
    private BorderPane bordarpane;
    @FXML
    private Label clockLabel;
    @FXML
    private Button logout;

    public void setUserFullName(String fullName) {
        userName.setText(fullName);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        
    }    

    @FXML
    private void logOutonClick(ActionEvent event) {
      try {


        FXMLLoader loader = new FXMLLoader(getClass().getResource("UserLogin.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        Stage currentStage = (Stage) logout.getScene().getWindow();
        currentStage.setScene(scene);
    } catch (IOException e) {
        e.printStackTrace();
    }
    }

    @FXML
    private void requestInterviewOnCLick(ActionEvent event) throws IOException {
      try {


        FXMLLoader loader = new FXMLLoader(getClass().getResource("User_4_RequestInterview.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        Stage currentStage = (Stage) logout.getScene().getWindow();
        currentStage.setScene(scene);
    } catch (IOException e) {
        e.printStackTrace();
    }    
    }

    @FXML
    private void uploadContentOnClick(ActionEvent event) {
    }

    @FXML
    private void updatePublishNews(ActionEvent event) {
    }

    @FXML
    private void storyGatherOnClick(ActionEvent event) {
    }

    @FXML
    private void connectWithWorkers(ActionEvent event) {
    }

    @FXML
    private void reportingOnClick(ActionEvent event) {
    }

    @FXML
    private void viewResource(ActionEvent event) {
    }

    @FXML
    private void viewSurveyOnCLick(ActionEvent event) {
    }
    @FXML
    private void navigateToDashboard(ActionEvent event) {
    }
    
}
