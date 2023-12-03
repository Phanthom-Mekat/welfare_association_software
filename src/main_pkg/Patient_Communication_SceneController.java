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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class Patient_Communication_SceneController implements Initializable {

    @FXML
    private TextField loadTextMessages;
    @FXML
    private TextField sendTextMessages;
    @FXML
    private Button logout;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loadMessagesButtonOnClick(ActionEvent event) {
        loadTextMessages.setText("User-3223:When is DR. Raju's Appointment?");      
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) {
        try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("User_8_WelcomePage.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        Stage currentStage = (Stage) logout.getScene().getWindow();
        currentStage.setScene(scene);
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    @FXML
    private void sendMessageButtonOnClick(ActionEvent event) {
        sendTextMessages.clear();
        sendTextMessages.setText("Messages Sent!");
    }
    
}
