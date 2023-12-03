package main_pkg;

import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class User_3_AssignTaskToWorkersController implements Initializable {

    @FXML
    private Button assignButton;
    @FXML
    private Button logout;
    @FXML
    private TextField newTaskNo;
    @FXML
    private TextField newTaskName;
    @FXML
    private TextArea newTaskDetails;


    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    

    @FXML
    private void assignButton(ActionEvent event) {
        File f = null;
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        
        try {
            f = new File("NewTaskData.bin");
            if(f.exists()) fos = new FileOutputStream(f,true);
            else fos = new FileOutputStream(f);
                 dos = new DataOutputStream(fos);
            
            dos.writeInt(Integer.parseInt(newTaskNo.getText()));
            dos.writeUTF(newTaskName.getText());
            dos.writeUTF(newTaskDetails.getText());

        } catch (IOException ex) {
            Logger.getLogger(User_3_AssignTaskToWorkersController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(dos != null) dos.close();
            } catch (IOException ex) {
                Logger.getLogger(User_3_AssignTaskToWorkersController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        newTaskNo.clear();
        newTaskName.clear();
        newTaskDetails.clear();
    }        
       

    @FXML
    private void taskNoClear(ActionEvent event) {
        newTaskNo.clear();

        
    }

    @FXML
    private void taskNameClear(ActionEvent event) {

        newTaskName.setText("");
    
    }

    @FXML
    private void taskDetailsClear(MouseEvent event) {

        newTaskDetails.setText("") ;     
    }        

    @FXML
    private void backOnClick(ActionEvent event) throws IOException{
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
