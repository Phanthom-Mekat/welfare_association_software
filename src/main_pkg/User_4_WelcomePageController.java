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
    private void generateInvoicesOnClick(ActionEvent event) {
    }

    @FXML
    private void SubmitAuditReport(ActionEvent event) {
    }

    @FXML
    private void PayRollOnClick(ActionEvent event) {
    }

    @FXML
    private void ProcessExpenseReimbursementOnCLick(ActionEvent event) {
    }

    @FXML
    private void overtimedataanalysisfromPayrollONClick(ActionEvent event) {
    }

    @FXML
    private void termsandpolicyOnClick(ActionEvent event) {
    }

    @FXML
    private void ReimbursementReportsOnClick(ActionEvent event) {
    }

    @FXML
    private void TrackAddWorkHrsOnClk(ActionEvent event) {
    }

    @FXML
    private void navigateToDashboard(ActionEvent event) {
    }

    @FXML
    private void logOutonClick(ActionEvent event) {
    }
    
}
