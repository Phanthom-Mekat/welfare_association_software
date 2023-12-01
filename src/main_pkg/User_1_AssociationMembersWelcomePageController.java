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
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author nirjharsikder
 */
public class User_1_AssociationMembersWelcomePageController implements Initializable {

    @FXML private Label userName;
    @FXML
    private Label userName1;
    
    public void setUserFullName(String fullName) {
        userName.setText(fullName);
    }
    
    
    

    



    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backButtonOnClick(MouseEvent event) throws IOException {
        Parent root = null;
        FXMLLoader someLoader = new FXMLLoader (getClass().getResource("UserLogin.fxml")) ;
        root = (Parent) someLoader.load ();
        Scene someScene = new Scene (root);
        Stage someStage = (Stage)((Node) event.getSource()).getScene().getWindow();
        someStage.setScene(someScene);
        someStage. show();        
    }

    @FXML
    private void membershipinformationButtonOnClick(MouseEvent event) throws IOException {
        Parent root = null;
        FXMLLoader someLoader = new FXMLLoader (getClass().getResource("User_1_MembershipInformationButtonPage.fxml")) ;
        root = (Parent) someLoader.load ();
        Scene someScene = new Scene (root);
        Stage someStage = (Stage)((Node) event.getSource()).getScene().getWindow();
        someStage.setScene(someScene);
        someStage. show();       
    }

    @FXML
    private void communicationButtonOnClick(MouseEvent event) throws IOException {
        Parent root = null;
        FXMLLoader someLoader = new FXMLLoader (getClass().getResource("User_1_CommunicationButtonPage.fxml")) ;
        root = (Parent) someLoader.load ();
        Scene someScene = new Scene (root);
        Stage someStage = (Stage)((Node) event.getSource()).getScene().getWindow();
        someStage.setScene(someScene);
        someStage. show();        
    }

    @FXML
    private void eventRegistrationButtonOnClick(MouseEvent event) throws IOException {
        Parent root = null;
        FXMLLoader someLoader = new FXMLLoader (getClass().getResource("User_1_EventRegistrationButtonPage.fxml")) ;
        root = (Parent) someLoader.load ();
        Scene someScene = new Scene (root);
        Stage someStage = (Stage)((Node) event.getSource()).getScene().getWindow();
        someStage.setScene(someScene);
        someStage. show();        
    }

    @FXML
    private void votingAndDecisionMakingButtonOnClick(MouseEvent event) throws IOException {
        Parent root = null;
        FXMLLoader someLoader = new FXMLLoader (getClass().getResource("User_1_VotingButtonPage.fxml")) ;
        root = (Parent) someLoader.load ();
        Scene someScene = new Scene (root);
        Stage someStage = (Stage)((Node) event.getSource()).getScene().getWindow();
        someStage.setScene(someScene);
        someStage. show();        
    }

    @FXML
    private void benefitAccessButtonOnClick(MouseEvent event) throws IOException {
        Parent root = null;
        FXMLLoader someLoader = new FXMLLoader (getClass().getResource("User_1_BenefitAccessButtonPage.fxml")) ;
        root = (Parent) someLoader.load ();
        Scene someScene = new Scene (root);
        Stage someStage = (Stage)((Node) event.getSource()).getScene().getWindow();
        someStage.setScene(someScene);
        someStage. show();        
    }

    @FXML
    private void membershipButtonFeeOnClick(MouseEvent event) throws IOException {
        Parent root = null;
        FXMLLoader someLoader = new FXMLLoader (getClass().getResource("User_1_MembershipFeeButtonPage.fxml")) ;
        root = (Parent) someLoader.load ();
        Scene someScene = new Scene (root);
        Stage someStage = (Stage)((Node) event.getSource()).getScene().getWindow();
        someStage.setScene(someScene);
        someStage. show();        
    }

    @FXML
    private void feedbackAndSuggestionsButtonOnClick(MouseEvent event) throws IOException {
        Parent root = null;
        FXMLLoader someLoader = new FXMLLoader (getClass().getResource("User_1_FeedbackAndSuggestionsButtonPage.fxml")) ;
        root = (Parent) someLoader.load ();
        Scene someScene = new Scene (root);
        Stage someStage = (Stage)((Node) event.getSource()).getScene().getWindow();
        someStage.setScene(someScene);
        someStage. show();        
    }

    @FXML
    private void memberDirectoryButtonOnClick(MouseEvent event) throws IOException {
        Parent root = null;
        FXMLLoader someLoader = new FXMLLoader (getClass().getResource("User_1_MemberDirectoryButtonPage.fxml")) ;
        root = (Parent) someLoader.load ();
        Scene someScene = new Scene (root);
        Stage someStage = (Stage)((Node) event.getSource()).getScene().getWindow();
        someStage.setScene(someScene);
        someStage. show();        
    }

    @FXML
    private void membershipFeeButtonOnClick(ActionEvent event) throws IOException {
        Parent root = null;
        FXMLLoader someLoader = new FXMLLoader (getClass().getResource("User_1_MembershipFeeButtonPage.fxml")) ;
        root = (Parent) someLoader.load ();
        Scene someScene = new Scene (root);
        Stage someStage = (Stage)((Node) event.getSource()).getScene().getWindow();
        someStage.setScene(someScene);
        someStage. show();         
    }
   
}
