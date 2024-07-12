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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class User_4_RequestInterviewController implements Initializable {

    @FXML
    private Button applyButton;
    @FXML
    private TextField nameTextField;
    @FXML
    private DatePicker datePicker;
    @FXML
    private TextField purposeTextField;
    @FXML
    private TextField mediaNameTextField;
    @FXML
    private TextField durationTextField;
    @FXML
    private Button logout;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    

    @FXML
    private void applyButton(ActionEvent event) throws IOException{
        File f = null;
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        
        try {
            f = new File("Interview.bin");
            if (!f.exists()) {
                fos = new FileOutputStream(f);
            } else {
                fos = new FileOutputStream(f, true);
            }
            dos = new DataOutputStream(fos);

            dos.writeUTF(nameTextField.getText());
            dos.writeUTF(mediaNameTextField.getText());
            dos.writeUTF(datePicker.getValue().toString());
            dos.writeUTF(purposeTextField.getText());
            dos.writeInt(Integer.parseInt(durationTextField.getText()));
            
            
        } catch (IOException ex) {
            Logger.getLogger(User_4_RequestInterviewController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(dos != null) dos.close();
            } catch (IOException ex) {
                Logger.getLogger(User_4_RequestInterviewController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        nameTextField.clear();
        mediaNameTextField.clear();
        purposeTextField.clear();
        durationTextField.clear();        
        
        
        
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
