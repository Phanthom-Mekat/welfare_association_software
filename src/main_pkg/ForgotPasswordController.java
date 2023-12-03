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
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DCL
 */
public class ForgotPasswordController implements Initializable {

    @FXML
    private TextField userIdTextField;
    @FXML
    private TextField oldPasswordTextField;
    @FXML
    private ComboBox<String> userTypeComboBox;
    @FXML
    private TextField newPasswordTextField;
    @FXML
    private TextField reenterNewPasswordTextField;
    @FXML
    private Button logout;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         userTypeComboBox.getItems().addAll("Association Member","Event Organizers","Association Leader","Media and Journalists","EWA Association Administrator","Social Auditors","Garment Industry Workers","Healthcare Providers");
        // TODO
    }    

    @FXML
    private void chngPassBtnOnClick(MouseEvent event) {
                try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("UserLogin.fxml"));
                Parent root = loader.load();
                Scene scene = new Scene(root);

                Stage currentStage = (Stage) logout.getScene().getWindow();
                currentStage.setScene(scene);
            }catch (IOException e) {
                e.printStackTrace();
        }
    }

    
}
