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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class Emergency_Alerts_SceneController implements Initializable {

    private TableView<Emergency> emergencyAlertsTableView;
    @FXML
    private Button logout;
    @FXML
    private TextField loadAlertsTextField;
    @FXML
    private TextField sendAlertsTextField;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loadAlertButtonOnClick(ActionEvent event) {
         loadAlertsTextField.setText("No Aleart To Show");
    }

    @FXML
    private void goBackButtonOnClick(ActionEvent event) {
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
    private void sendAleartButtonOnClick(ActionEvent event) {
        sendAlertsTextField.clear();
        sendAlertsTextField.setText("Alart Sent!");
        
    }

    private static class Emergency {

        public Emergency() {
        }
    }
    
}
