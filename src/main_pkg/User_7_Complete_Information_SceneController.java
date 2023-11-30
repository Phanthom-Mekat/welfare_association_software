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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class User_7_Complete_Information_SceneController implements Initializable {

    @FXML
    private TextField nameCol;
    @FXML
    private TextField phoneCol;
    @FXML
    private TextArea detailsCol;
    @FXML
    private ComboBox<String> typeCol;
    @FXML
    private ComboBox<String> genderCol;
    @FXML
    private Button logout;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        typeCol.getItems().addAll("Sewing Machine Operators","Cutting Department Workers","Machine Mechanics");
        genderCol.getItems().addAll("Male","Female");
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

    @FXML
    private void submitButtonOnClick(ActionEvent event) {
        File f = null;
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        
        try {
            f = new File("CompleteInformation1.bin");
            if (!f.exists()) {
                fos = new FileOutputStream(f);
            } else {
                fos = new FileOutputStream(f, true);
            }
            dos = new DataOutputStream(fos);

            dos.writeUTF(nameCol.getText());
            dos.writeInt(Integer.parseInt(phoneCol.getText()));
            dos.writeUTF(detailsCol.getText());
            dos.writeUTF(typeCol.getValue() != null ? typeCol.getValue() : "");
            dos.writeUTF(genderCol.getValue() != null ? genderCol.getValue() : "");

        } catch (IOException ex) {
            Logger.getLogger(User_3_AssignTaskToWorkersController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(dos != null) dos.close();
            } catch (IOException ex) {
                Logger.getLogger(User_3_AssignTaskToWorkersController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        phoneCol.clear();
        nameCol.clear();
        detailsCol.clear();
//        typeCol.setValue(null);
//        genderCol.setValue(null);
    }        
      
    
}
