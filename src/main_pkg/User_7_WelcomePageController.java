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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Asus
 */
public class User_7_WelcomePageController implements Initializable {

    @FXML
    private Label userName;
    private Object currentStage;
    private Button goback;    
    @FXML
    private ComboBox<String> selectgoalFxId;
    @FXML
    private Button logout;

    public void setUserFullName(String fullName) {
        userName.setText(fullName);
   
    }
             
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        selectgoalFxId.getItems().addAll("Task Management","Task Status Updates","Feedback Submission","Quality Control","Communication","Complete Information","Earnings","Training Materials");
    }    


    @FXML
    private void mainMenuButtonOnClick(ActionEvent event) {
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
    private void nextButtonOnClick(ActionEvent event) throws IOException {

    String a = selectgoalFxId.getValue().toString();
    Parent sceneA = null;

    if ("Task Management".equals(a)) {
        sceneA = FXMLLoader.load(getClass().getResource("Task_Management_Scene.fxml"));
    }
    if ("Task Status Updates".equals(a)) {
        sceneA = FXMLLoader.load(getClass().getResource("Task_Status_Updates_Scene.fxml"));
    }
    if ("Feedback Submission".equals(a)) {
        sceneA = FXMLLoader.load(getClass().getResource("Feedback_Submission_Scene.fxml"));
    }
    if ("Quality Control".equals(a)) {
        sceneA = FXMLLoader.load(getClass().getResource("Quality_Control_Scene.fxml"));
    }
    if ("Communication".equals(a)) {
        sceneA = FXMLLoader.load(getClass().getResource("Workers_Communication_Scene.fxml"));
    }
    if ("Training Materials".equals(a)) {
        sceneA = FXMLLoader.load(getClass().getResource("Training_Materials_Scene.fxml"));
    }
    if ("Earnings".equals(a)) {
        sceneA = FXMLLoader.load(getClass().getResource("Show_Earnings_Scene.fxml"));
    }

    // Default case if none of the conditions match
    if (sceneA == null) {
        sceneA = FXMLLoader.load(getClass().getResource("User_7_Complete_Information_Scene.fxml"));
    }

    Scene sceneJ = new Scene(sceneA);
    Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
    stg.setScene(sceneJ);
    stg.show();
}}
