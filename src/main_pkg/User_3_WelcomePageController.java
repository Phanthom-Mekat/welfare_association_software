package main_pkg;

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
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;



public class User_3_WelcomePageController implements Initializable {

    @FXML
    private BorderPane dashboard;
    @FXML
    private Label userName;
    @FXML
    private Label clockLabel;
    @FXML
    private Button logout;
    
    public void setUserFullName(String fullName) {
        userName.setText(fullName);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Clock clock = new Clock(clockLabel);

    }    




    @FXML
    private void logout(ActionEvent event){
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

    @FXML
    private void laborComplianceOnClick(ActionEvent event) throws IOException{
        Parent parent = FXMLLoader.load(getClass().getResource("User_3_LaborCompliance.fxml"));
        dashboard.setCenter(parent);
    }



    @FXML
    private void viewAndUpdateInformationAboutGarmentWorker(ActionEvent event) throws IOException{
        try {


        FXMLLoader loader = new FXMLLoader(getClass().getResource("User_3_ViewAndUpdateInformationWorkers.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        Stage currentStage = (Stage) logout.getScene().getWindow();
        currentStage.setScene(scene);
    } catch (IOException e) {
        e.printStackTrace();
    }
        
    }

    @FXML
    private void sendNotificationUpdateToWorker(ActionEvent event)throws IOException {
        try {


        FXMLLoader loader = new FXMLLoader(getClass().getResource("User_3_CheckNotification.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        Stage currentStage = (Stage) logout.getScene().getWindow();
        currentStage.setScene(scene);
    } catch (IOException e) {
        e.printStackTrace();
    }        
        
    }





    @FXML
    private void assignTaskToWorkersOnClick(ActionEvent event) throws IOException {
        try {


        FXMLLoader loader = new FXMLLoader(getClass().getResource("User_3_AssignTaskToWorkers.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        Stage currentStage = (Stage) logout.getScene().getWindow();
        currentStage.setScene(scene);
    } catch (IOException e) {
        e.printStackTrace();
    }  
    }

    @FXML
    private void showFeedbackOfTheWorkers(ActionEvent event)throws IOException {
        try {


        FXMLLoader loader = new FXMLLoader(getClass().getResource("User_3_ShowFeedback.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        Stage currentStage = (Stage) logout.getScene().getWindow();
        currentStage.setScene(scene);
    } catch (IOException e) {
        e.printStackTrace();
    }     
    }

    @FXML
    private void viewInterviewOnClick(ActionEvent event)throws IOException {
        try {


        FXMLLoader loader = new FXMLLoader(getClass().getResource("User_3_ViewInterview.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        Stage currentStage = (Stage) logout.getScene().getWindow();
        currentStage.setScene(scene);
    } catch (IOException e) {
        e.printStackTrace();
    }        
    }

    @FXML
    private void viewMediaContent(ActionEvent event) {

    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("User_3_ViewMedia.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        Stage currentStage = (Stage) logout.getScene().getWindow();
        currentStage.setScene(scene);
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    @FXML
    private void createPieChartOnTheRatioOfGarmentWorkers(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("User_3_CreatePieChart.fxml"));
        dashboard.setCenter(parent);          
    }

    
}