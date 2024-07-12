
package main_pkg;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author DCL
 */
public class User_3_WagesAndWorkingHourController implements Initializable {

    @FXML
    private TextArea textArea;
    @FXML
    private Button logout;


    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    

    @FXML
    private void editOnClick(ActionEvent event) throws IOException {
        textArea.setEditable(true);
       
    }

    @FXML
    private void submitOnClick(ActionEvent event) throws IOException {
        
        textArea.setEditable(false);
        File f = null;
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        
        try {
            f = new File("wagesandworkinghour.bin");
            if (!f.exists()) {
                fos = new FileOutputStream(f);
            } else {
                fos = new FileOutputStream(f, true);
            }
            dos = new DataOutputStream(fos);

            dos.writeUTF(textArea.getText());


        } catch (IOException ex) {
            Logger.getLogger(User_3_WagesAndWorkingHourController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(dos != null) dos.close();
            } catch (IOException ex) {
                Logger.getLogger(User_3_WagesAndWorkingHourController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
 
    }

    @FXML
    private void backOnClick(ActionEvent event) throws IOException {
        try {


        FXMLLoader loader = new FXMLLoader(getClass().getResource("User_3_LaborCompliance.fxml"));
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
