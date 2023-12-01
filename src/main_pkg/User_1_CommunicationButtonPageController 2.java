/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main_pkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author nirjharsikder
 */
public class User_1_CommunicationButtonPageController implements Initializable {

    @FXML
    private TableView<User_1_AssociationMembers> cotactTableView;
    @FXML
    private TableColumn<User_1_AssociationMembers,String> AssociationMembersNameTableColumn;
    @FXML
    private TableColumn<User_1_AssociationMembers,String> PhoneNumberTablecolmn;
    @FXML
    private TableColumn<User_1_AssociationMembers,String> eMailTableColumn;
    @FXML
    private TableColumn<User_1_AssociationMembers,String> userIdTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {        
        AssociationMembersNameTableColumn.setCellValueFactory(new PropertyValueFactory<User_1_AssociationMembers,String>("name"));
        PhoneNumberTablecolmn.setCellValueFactory(new PropertyValueFactory<User_1_AssociationMembers,String>("phoneNumber"));
        eMailTableColumn.setCellValueFactory(new PropertyValueFactory<User_1_AssociationMembers,String>("eMail"));
        userIdTableColumn.setCellValueFactory(new PropertyValueFactory<User_1_AssociationMembers,String>("userID"));
        User_1_AssociationMembers m1 = new User_1_AssociationMembers("adib","Adib Mahamud","01867061986","adib@gmailcom");
        User_1_AssociationMembers m2 = new User_1_AssociationMembers("tawhid","Tasnim Hasan Tawhid","01745839921","tawhid@gmail.com");
        User_1_AssociationMembers m3 = new User_1_AssociationMembers("syam","Syam","01785635592","syam@gmail.com");
        User_1_AssociationMembers m4 = new User_1_AssociationMembers("rohan","Rohan Khan","01746285491","rohan@gmail.com");
        User_1_AssociationMembers m5 = new User_1_AssociationMembers("ratul","Ratul Roy","01753618352","ratul@gmail.com");
        User_1_AssociationMembers m6 = new User_1_AssociationMembers("sneha","Sneha Sikder","018343627441","sneha@gmail.com");
        User_1_AssociationMembers m7 = new User_1_AssociationMembers("rafi","Rafi Ahmed","01767382622","rafi@gmail.com");
        User_1_AssociationMembers m8 = new User_1_AssociationMembers("miraz","Miraz Khan","01785635592","miraz@gmail.com");
        User_1_AssociationMembers m9 = new User_1_AssociationMembers("hridan","Hridan Ahmed","01764738924","hridan@gmail.com");
        User_1_AssociationMembers m10 = new User_1_AssociationMembers("tanim","Tanim","01853639253","tanim@gmail.com");
        User_1_AssociationMembers m11 = new User_1_AssociationMembers("pritom","Pritom Roy","01763839264","pritom@gmail.com");
        User_1_AssociationMembers m12 = new User_1_AssociationMembers("nasim","Nasim Mahmud","01785635592","nasim@gmail.com");
        User_1_AssociationMembers m13 = new User_1_AssociationMembers("shanto","Saidur Rahman Shanto","01736281643","shanto@gmail.com");
        User_1_AssociationMembers m14 = new User_1_AssociationMembers("tanjim","Tanjim Ahmed","01786482628","Tanjim@gmail.com");       
        User_1_AssociationMembers m15 = new User_1_AssociationMembers("sumon","Sumon Sikder","018463782437","sumon@gmail.com");
        User_1_AssociationMembers m16 = new User_1_AssociationMembers("shukla","Shikla Das","01763782274","syam@gmail.com");
        User_1_AssociationMembers m17 = new User_1_AssociationMembers("rizon","Rizon","01785635592","rizon@gmail.com");
        ObservableList<User_1_AssociationMembers> User_1_AssociationMembersList = FXCollections.observableArrayList();
        User_1_AssociationMembersList.add (m1);
        User_1_AssociationMembersList.add (m2);
        User_1_AssociationMembersList.add (m3);
        User_1_AssociationMembersList.add (m4);
        User_1_AssociationMembersList.add (m5);
        User_1_AssociationMembersList.add (m6);
        User_1_AssociationMembersList.add (m7);
        User_1_AssociationMembersList.add (m8);
        User_1_AssociationMembersList.add (m9);
        User_1_AssociationMembersList.add (m10);
        User_1_AssociationMembersList.add (m11);
        User_1_AssociationMembersList.add (m12);
        User_1_AssociationMembersList.add (m13);
        User_1_AssociationMembersList.add (m14);
        User_1_AssociationMembersList.add (m15);
        User_1_AssociationMembersList.add (m16);
        User_1_AssociationMembersList.add (m17);

        cotactTableView.setItems(User_1_AssociationMembersList);
    }    

    @FXML
    private void backBurronONCick(ActionEvent event) throws IOException {
        Parent root = null;
        FXMLLoader someLoader = new FXMLLoader (getClass().getResource("User_1_AssociationMembersWelcomePage.fxml")) ;
        root = (Parent) someLoader.load ();
        Scene someScene = new Scene (root);
        Stage someStage = (Stage)((Node) event.getSource()).getScene().getWindow();
        someStage.setScene(someScene);
        someStage. show();         
    }
    
}
