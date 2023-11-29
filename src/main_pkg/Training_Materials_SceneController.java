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
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class Training_Materials_SceneController implements Initializable {

    @FXML
    private ComboBox<String> selectMetarialTypeFxId;
    @FXML
    private Button logout;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        selectMetarialTypeFxId.getItems().addAll("PDF","File","Apply for skill Development");
    }    
    @FXML
    private void trainingMetarialsButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) {
        try {

    
        FXMLLoader loader = new FXMLLoader(getClass().getResource("User_7_WelcomePage.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        Stage currentStage = (Stage) logout.getScene().getWindow();
        currentStage.setScene(scene);
    } catch (IOException e) {
        e.printStackTrace();
    }

 
} 
    
}
