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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class Show_Earnings_SceneController implements Initializable {

    @FXML
    private AnchorPane selectEarningTypeFxId;
    @FXML
    private ComboBox<String> earningTypeFxId;
    @FXML
    private Button logout;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        earningTypeFxId.getItems().addAll("New Balance","Withdrawal Histry");
    }    

    @FXML
    private void nextButtonOnClick(ActionEvent event) throws IOException {
        
        String a=earningTypeFxId.getValue().toString();
        Parent sceneA;
        if(a=="New Balance"){
          sceneA=FXMLLoader.load(getClass().getResource("New_Balance_Scene.fxml"));  
        }
        else{
          sceneA=FXMLLoader.load(getClass().getResource("Withdrawal_History_Scene.fxml"));
        }
        
        Scene sceneB=new Scene(sceneA);
        Stage stg=(Stage)((Node)event.getSource()).getScene().getWindow();
        stg.setScene(sceneB);
        stg.show();
    }
    

    @FXML
    private void backButtonOnClick(ActionEvent event) {
        try {

    
        FXMLLoader loader = new FXMLLoader(getClass().getResource("User_7_WelcomePage.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        Stage currentStage = (Stage) logout.getScene().getWindow();
        currentStage.setScene(scene);
    } catch (IOException e) {
        e.printStackTrace();
    }

 
} 
    
}
