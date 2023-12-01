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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author nirjharsikder
 */
public class User_1_FeedbackAndSuggestionsButtonPageController implements Initializable {

    @FXML
    private ComboBox<String> feedbackOrSuggestionChoosingComboBox;
    @FXML
    private TextField userIDTextField;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField feedbackAndSuggestionsWritingTextField;
    @FXML
    private Label confarmationLabel;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        feedbackOrSuggestionChoosingComboBox.getItems().addAll("Feedback","Suggestion");

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
    private void submitButtonOnClick(ActionEvent event) {
        String x;
        x = feedbackOrSuggestionChoosingComboBox.getValue();
        
        confarmationLabel.setText("Thanks for the "+ x );
        
    }
    
}