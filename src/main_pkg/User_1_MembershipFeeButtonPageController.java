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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author nirjharsikder
 */
public class User_1_MembershipFeeButtonPageController implements Initializable {

    @FXML
    private ComboBox<String> postComboBox;
    @FXML
    private TextField userIDTextField;
    @FXML
    private TextField nameTextField;
    @FXML
    private TableView<User_1_MembershipFeeManagement> feeManagementTableView;
    @FXML
    private TableColumn<User_1_MembershipFeeManagement,String> NameTableColumn;
    @FXML
    private TableColumn<User_1_MembershipFeeManagement, String> FeeTableColumn;
    @FXML
    private TableColumn<User_1_MembershipFeeManagement,String> posrTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        postComboBox.getItems().addAll(
                "President",
                "Vice President",
                "Treasurer",
                "Head of operation",
                "HR");
         NameTableColumn.setCellValueFactory(new PropertyValueFactory<User_1_MembershipFeeManagement,String>("name"));
         posrTableColumn.setCellValueFactory(new PropertyValueFactory<User_1_MembershipFeeManagement,String>("post"));
         FeeTableColumn.setCellValueFactory(new PropertyValueFactory<User_1_MembershipFeeManagement,String>("Fee"));
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
    private void generateFeeButtonOnclick(ActionEvent event) {
        String nm,pt,v;
        nm = nameTextField.getText();
        pt =postComboBox.getValue();
        v = null;
 
        if(postComboBox.getValue().equals("President")){v="100000";}
        if(postComboBox.getValue().equals("Vice President")){v="80000";}
        if(postComboBox.getValue().equals("Treasurer")){v="50000";}
        if(postComboBox.getValue().equals("Head of operation")){v="50000";}
        if(postComboBox.getValue().equals("HR")){v="40000";}
       
        int valint;
        valint = Integer.parseInt(v);
        
       feeManagementTableView.getItems().add(
                new User_1_MembershipFeeManagement(nm,pt,valint)
        );        
    }

    @FXML
    private void paymentButtonOnClick(ActionEvent event) {
    }
    
}
