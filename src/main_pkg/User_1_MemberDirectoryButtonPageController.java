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
public class User_1_MemberDirectoryButtonPageController implements Initializable {

    @FXML
    private TableView<User_1_MemberDirectory> MemberDirectoryTableView;
    @FXML
    private TableColumn<User_1_MemberDirectory, String> NameTableColumn;
    @FXML
    private TableColumn<User_1_MemberDirectory, String> postTableColumn;
    @FXML
    private TextField postWritingTextField;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField userIdTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        NameTableColumn.setCellValueFactory(new PropertyValueFactory<User_1_MemberDirectory,String>("name"));
        postTableColumn.setCellValueFactory(new PropertyValueFactory<User_1_MemberDirectory,String>("Posts"));
        

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
    private void postButtonOnClick(ActionEvent event) {
        String nm,pt;
        nm = nameTextField.getText();
        pt =postWritingTextField.getText();
        MemberDirectoryTableView.getItems().add(
                new User_1_MemberDirectory(nm,pt)
        );        
    }
    
}
