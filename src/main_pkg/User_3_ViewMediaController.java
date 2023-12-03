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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DCL
 */
public class User_3_ViewMediaController implements Initializable {

    @FXML
    private ComboBox<String> mediaComboBox;
    @FXML
    private ComboBox<Integer> selectDayComboBox;
    @FXML
    private Button logout;
    @FXML
    private TextArea textAreaNews;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
         mediaComboBox.getItems().addAll("BTV","GTV","Machranga","SomoyTV","EkuseyTv","Trust Me bro TV");
         selectDayComboBox.getItems().addAll(1, 2, 3, 7,30);
    }    

    @FXML
    private void loadNewsOnClick(ActionEvent event) {
        
        
    }

    @FXML
    private void backOnClick(ActionEvent event) {        
        try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("User_3_WelcomePage.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        Stage currentStage = (Stage) logout.getScene().getWindow();
        currentStage.setScene(scene);
    } catch (IOException e) {
        e.printStackTrace();
    }
        
    }

    @FXML
    private void logout(ActionEvent event) {
        try {


        FXMLLoader loader = new FXMLLoader(getClass().getResource("UserLogin.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        Stage currentStage = (Stage) logout.getScene().getWindow();
        currentStage.setScene(scene);
    } catch (IOException e) {
        e.printStackTrace();
    }        
        
    }
    
}
