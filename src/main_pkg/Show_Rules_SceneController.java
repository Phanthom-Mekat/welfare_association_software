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
import javafx.stage.Stage;


public class Show_Rules_SceneController implements Initializable {

    @FXML
    private TextArea textArea;
    @FXML
    private Button logout;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backButtonOnClick(ActionEvent event) {
        try {

    
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Patient_Education_Scene.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        Stage currentStage = (Stage) logout.getScene().getWindow();
        currentStage.setScene(scene);
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
    @FXML
    private void editButtonOnClick(ActionEvent event) {
        textArea.setEditable(true);
    }

    @FXML
    private void submitButtonOnClick(ActionEvent event) {
        textArea.setEditable(false);    
    }
    
}
