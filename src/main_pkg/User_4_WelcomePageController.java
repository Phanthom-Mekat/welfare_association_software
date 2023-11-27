/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main_pkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author DCL
 */
public class User_4_WelcomePageController implements Initializable {

    @FXML
    private Label userName;

    public void setUserFullName(String fullName) {
        userName.setText(fullName);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        
    }    
    
}
