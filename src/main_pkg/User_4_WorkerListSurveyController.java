/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main_pkg;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DCL
 */
public class User_4_WorkerListSurveyController implements Initializable {

    @FXML
    private TextField machineOperator;
    @FXML
    private TextField patternMaker;
    @FXML
    private TextField cutters;
    @FXML
    private TextField qualityControl;
    @FXML
    private TextField textileDesigners;
    @FXML
    private Button logout;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void submitOnClick(ActionEvent event) {
        File f = null;
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        
        try {
            f = new File("WorkerListSurvey.bin");
            if (!f.exists()) {
                fos = new FileOutputStream(f);
            } else {
                fos = new FileOutputStream(f, true);
            }
            dos = new DataOutputStream(fos);
            dos.writeInt(Integer.parseInt(machineOperator.getText()));
            dos.writeInt(Integer.parseInt(patternMaker.getText()));
            dos.writeInt(Integer.parseInt(cutters.getText()));
            dos.writeInt(Integer.parseInt(qualityControl.getText()));
            dos.writeInt(Integer.parseInt(textileDesigners.getText()));




        } catch (IOException ex) {
            Logger.getLogger(User_4_WorkerListSurveyController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(dos != null) dos.close();
            } catch (IOException ex) {
                Logger.getLogger(User_4_WorkerListSurveyController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        machineOperator.clear();
        patternMaker.clear();
        cutters.clear();        
        qualityControl.clear();        
        textileDesigners.clear();        
        
        
    }

    @FXML
    private void backOnClick(ActionEvent event)throws IOException {
      try {


        FXMLLoader loader = new FXMLLoader(getClass().getResource("User_4_WelcomePage.fxml"));
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
