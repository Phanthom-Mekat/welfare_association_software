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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DCL
 */
public class UserLoginController implements Initializable {

    @FXML
    private TextField userIdTextField;
    @FXML
    private TextField passwordTextField;
    @FXML
    private ComboBox<String> userTypeComboBox;
    @FXML
    private Button login;
    @FXML
    private Button signupButton;
    @FXML
    private Label clockLabel;

    @FXML
    private Button exitButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        userTypeComboBox.getItems().addAll("Association Member","Event Organizers","Association Leader","Media and Journalists","EWA Association Administrator"
                                            ,"Social Auditors ","Garment Industry Workers","Healthcare Providers");       
        Clock clock = new Clock(clockLabel);

        userIdTextField.setText("admin");
        passwordTextField.setText("123456789");
    }    

    @FXML
    private void forgotPasswordButtonOnClick(ActionEvent event) {
        
    }

    @FXML
    private void loginButtonOnClick(ActionEvent event) throws IOException {
        String userType = userTypeComboBox.getValue();
            if (userType == null) {
        showErrorAlert("Error", "Please select a user type.");
        return;
        }

        String username = userIdTextField.getText();
        String password = passwordTextField.getText();
 
        
        boolean isValidLogin = SignUpFile.SignUpFileRead(userType, username, password); 

        if (isValidLogin) {
            
            String userFullName = SignUpFile.FileRead_forUserName(userType, username, password);
            
             Stage currentStage = (Stage) login.getScene().getWindow();
             if(userType.equals("Association Leader")){                 
                 FXMLLoader loader = new FXMLLoader(getClass().getResource("User_3_WelcomePage.fxml"));
                 Parent root = loader.load();
                 User_3_WelcomePageController dashboardController = loader.getController();
                 dashboardController.setUserFullName(userFullName); 
                 Scene scene = new Scene(root);
                 currentStage.setScene(scene);
             }
             if(userType.equals("Media and Journalists")){
                 FXMLLoader loader = new FXMLLoader(getClass().getResource("User_4_WelcomePage.fxml"));
                 Parent root = loader.load();
                 User_4_WelcomePageController dashboardController = loader.getController();
                 dashboardController.setUserFullName(userFullName); 
                 Scene scene = new Scene(root);
                 currentStage.setScene(scene);
             }
             if(userType.equals("Garment Industry Workers")){
                 FXMLLoader loader = new FXMLLoader(getClass().getResource("User_7_WelcomePage.fxml"));
                 Parent root = loader.load();
                 User_7_WelcomePageController dashboardController = loader.getController();
                 dashboardController.setUserFullName(userFullName); 
                 Scene scene = new Scene(root);
                 currentStage.setScene(scene);
             }  
             if(userType.equals("Healthcare Providers")){
                 FXMLLoader loader = new FXMLLoader(getClass().getResource("User_8_WelcomePage.fxml"));
                 Parent root = loader.load();
                 User_8_WelcomePageController dashboardController = loader.getController();
                 dashboardController.setUserFullName(userFullName); 
                 Scene scene = new Scene(root);
                 currentStage.setScene(scene);
             }             
        }
        
        else{
            
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setHeaderText("Unable to Login");
            a.setContentText("UserID and Password is Invalid");
            a.showAndWait();
          
        }

        
        
    }


    @FXML
    private void signUpButtonOnClick(ActionEvent event) {
        try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("SignUp.fxml"));
                Parent root = loader.load();
                Scene scene = new Scene(root);

                // Get the current stage from any node in the current scene
                Stage currentStage = (Stage) signupButton.getScene().getWindow();
                currentStage.setScene(scene);
            }catch (IOException e) {
                e.printStackTrace();
        }
    }



    @FXML
    private void ExitButtonOnClick(ActionEvent event) {
    }
    private void showErrorAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    
}
