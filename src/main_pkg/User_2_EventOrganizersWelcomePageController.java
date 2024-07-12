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
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author DCL
 */
public class User_2_EventOrganizersWelcomePageController implements Initializable {

    @FXML
    private Label NumberofEventOrganizersLabel;
    @FXML
    private Label userName;
    public void setUserFullName(String fullName) {
        userName.setText(fullName);}
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backButtonOnClick(MouseEvent event) {
    }

    @FXML
    private void eventPlanningButtonOnClick(MouseEvent event) {
    }

    @FXML
    private void schedulingButtonOnClick(MouseEvent event) {
    }

    @FXML
    private void attendanceTrackingButtonOnClick(MouseEvent event) {
    }

    @FXML
    private void promotionandMarketingButtonOnClick(MouseEvent event) {
    }

    @FXML
    private void rSVPManagementButtonOnClick(MouseEvent event) {
    }

    @FXML
    private void communicationButtonFeeOnClick(MouseEvent event) {
    }

    @FXML
    private void feedbackCollectionButtonOnClick(MouseEvent event) {
    }

    @FXML
    private void eventPhotosandUpdatesButtonOnClick(MouseEvent event) {
    }
    
}
