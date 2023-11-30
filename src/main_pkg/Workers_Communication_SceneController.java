package main_pkg;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
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
import javafx.scene.control.TextArea;
import javafx.stage.Stage;


public class Workers_Communication_SceneController implements Initializable {

    @FXML
    private TextArea workersCommunicationTextArea;
    @FXML
    private Button logout;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loadMessagesOnClick(ActionEvent event) throws IOException {
        workersCommunicationTextArea.setText("");
        File f = null;
        FileInputStream fis = null;
        DataInputStream dis = null;
        String str="";
        try {
            f = new File("notification.bin");
            if(!f.exists()){
                workersCommunicationTextArea.setText("Oops! notification.bin binary file does not exist...");
            }
            else{
                
                fis = new FileInputStream(f);
                dis = new DataInputStream(fis);
                while(true){
                    str+= "NotificationTyepe:"
                        +dis.readUTF()
                        +"; Details :"+dis.readUTF()
                        +"\n";

                }

            }
        } catch (IOException ex) {
            workersCommunicationTextArea.setText(str);
            Logger.getLogger(Workers_Communication_SceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(dis != null) dis.close();
            } catch (IOException ex) {
                Logger.getLogger(Workers_Communication_SceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
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
