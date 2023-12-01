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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


public class User_1_EventRegistrationButtonPageController implements Initializable {

    @FXML
    private ComboBox<String> registrationEventNamesComboBox;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField userIDTextField;
    @FXML
    private TextField extraGuestTextField;
    @FXML
    private TableView<User_1_2_Registration> registrationTableView;
    @FXML
    private TableColumn<User_1_2_Registration,String> nameTableColum;
    @FXML
    private TableColumn<User_1_2_Registration,String> extraGuestsTableColumn;
    @FXML
    private TableColumn<User_1_2_Registration,String> registrationFeetableColumn;
    @FXML
    private ComboBox<String> FeedbackEventNameComboBox;
    @FXML
    private ComboBox<String> foodRatingComboBox;
    @FXML
    private ComboBox<String> decorationRatingComboBox;
    @FXML
    private ComboBox<String> lightingRatingComboBox;
    @FXML
    private TextField foodRatingTextField;
    @FXML
    private TextField lightingRatingTextField;
    @FXML
    private TextField decorationRatingTeaxtField;
    @FXML
    private ComboBox<String> attendanceEventNameComboBox;
    @FXML
    private Label attendanceConfarmationLabel;
    @FXML
    private TableColumn<User_1_2_Registration,String> eventNameTableColumn;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        registrationEventNamesComboBox.getItems().addAll(
                "Cultural Celebrations",
                "Career Development Seminars",
                "Health and Wellness Workshops",
                "Sports Tournaments",
                "Financial Literacy Programs",
                "Safety Awareness Campaigns",
                "Community Service Initiatives");
        FeedbackEventNameComboBox.getItems().addAll(
                "Cultural Celebrations",
                "Career Development Seminars",
                "Health and Wellness Workshops",
                "Sports Tournaments",
                "Financial Literacy Programs",
                "Safety Awareness Campaigns",
                "Community Service Initiatives");
        attendanceEventNameComboBox.getItems().addAll(
                "Cultural Celebrations",
                "Career Development Seminars",
                "Health and Wellness Workshops",
                "Sports Tournaments",
                "Financial Literacy Programs",
                "Safety Awareness Campaigns",
                "Community Service Initiatives");
        foodRatingComboBox.getItems().addAll(
                "Excellent",
                "Good",
                "Average",
                "Bad");
        decorationRatingComboBox.getItems().addAll(
                "Excellent",
                "Good",
                "Average",
                "Bad");
        lightingRatingComboBox.getItems().addAll(
                "Excellent",
                "Good",
                "Average",
                "Bad");
        
        nameTableColum.setCellValueFactory(new PropertyValueFactory<User_1_2_Registration,String>("name"));
        eventNameTableColumn.setCellValueFactory(new PropertyValueFactory<User_1_2_Registration,String>("eventNames"));
        extraGuestsTableColumn.setCellValueFactory(new PropertyValueFactory<User_1_2_Registration,String>("extraGuest"));
        registrationFeetableColumn.setCellValueFactory(new PropertyValueFactory<User_1_2_Registration,String>("registrationFee"));
        
    }    

    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
        Parent root = null;
        FXMLLoader someLoader = new FXMLLoader (getClass().getResource("User_1_AssociationMembersWelcomePage.fxml")) ;
        root = (Parent) someLoader.load ();
        Scene someScene = new Scene (root);
        Stage someStage = (Stage)((Node) event.getSource()).getScene().getWindow();
        someStage.setScene(someScene);
        someStage. show();        
    }

    @FXML
    private void registerButtonOnClick(ActionEvent event) {
        String nm,eg,en;
        nm = nameTextField.getText();
        eg = extraGuestTextField.getText();
        en =registrationEventNamesComboBox.getValue();
        int egint,rfint;
        egint = Integer.parseInt(eg);
        rfint = egint * 700 +1000 ;
        registrationTableView.getItems().add(
                new User_1_2_Registration(nm,en,egint,rfint)
        );        
    }

    @FXML
    private void paymentButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void sendAttendenceButtononOnClick(ActionEvent event) {
        
        attendanceConfarmationLabel.setText("Done Attendance");       
    }

    @FXML
    private void feetbackSubmationButtonOnClick(ActionEvent event) {
    }
    
}
