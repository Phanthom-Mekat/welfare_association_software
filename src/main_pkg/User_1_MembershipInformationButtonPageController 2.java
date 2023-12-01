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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author nirjharsikder
 */
public class User_1_MembershipInformationButtonPageController implements Initializable {

    @FXML
    private Label NumberofAssociationMembersLabel;
    @FXML
    private TableView<?> membershipInformationTableView;
    @FXML
    private TableColumn<?, ?> associationMembersNameTableColumn;
    @FXML
    private TableColumn<?, ?> MembershipStatusTableColumn;
    @FXML
    private TableColumn<?, ?> activityTableColumn;
    @FXML
    private ComboBox<String> selectPostComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        selectPostComboBox.getItems().addAll("President","Vice President","Treasurer","Head of operation","HR");
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
    
}
