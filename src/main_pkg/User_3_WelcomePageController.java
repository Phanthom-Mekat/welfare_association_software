/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main_pkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author DCL
 */
public class User_3_WelcomePageController implements Initializable {

    @FXML
    private BorderPane dashboard;
    @FXML
    private Label userName;
    @FXML
    private Label clockLabel;
    @FXML
    private Button logout;
    
    public void setUserFullName(String fullName) {
        userName.setText(fullName);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void caseAssignmentOnCLick(ActionEvent event) {
    }

    @FXML
    private void checkClientDocument(ActionEvent event) {
    }

    @FXML
    private void SendTermsAndPolicToDocManagerOnClick(ActionEvent event) {
    }

    @FXML
    private void checkNotification(ActionEvent event) {
    }

    @FXML
    private void caseChartOnClick(ActionEvent event) {
    }

    @FXML
    private void viewClintCaseRequests(ActionEvent event) {
    }

    @FXML
    private void reimbursementOnClick(ActionEvent event) {
    }

    @FXML
    private void termsOnClick(ActionEvent event) {
    }

    @FXML
    private void navigateToDashboard(ActionEvent event) {
    }

    @FXML
    private void logout(ActionEvent event) {
    }
    
}
