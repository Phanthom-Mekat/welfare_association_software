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
import javafx.stage.Stage;


public class Patient_Education_SceneController implements Initializable {

    @FXML
    private ComboBox<String> selectviewTypeFxId;
    @FXML
    private Button logout;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       selectviewTypeFxId.getItems().addAll("Read Advices","Show Rules");
    }     

    @FXML
    private void nextButtonOnClick(ActionEvent event) throws IOException {
        
        String a=selectviewTypeFxId.getValue().toString();
        Parent sceneA;
        if(a=="Read Advices"){
          sceneA=FXMLLoader.load(getClass().getResource("Patient_Advice_Scene.fxml"));  
        }
        else{
          sceneA=FXMLLoader.load(getClass().getResource("Show_Rules_Scene.fxml"));
        }
        
        Scene sceneB=new Scene(sceneA);
        Stage stg=(Stage)((Node)event.getSource()).getScene().getWindow();
        stg.setScene(sceneB);
        stg.show();
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) {
         try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("User_8_WelcomePage.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        Stage currentStage = (Stage) logout.getScene().getWindow();
        currentStage.setScene(scene);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    
}
