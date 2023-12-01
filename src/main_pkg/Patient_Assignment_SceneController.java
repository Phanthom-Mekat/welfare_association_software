/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main_pkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class Patient_Assignment_SceneController implements Initializable {

    @FXML
    private TableColumn<New_Patient,Integer> assignPatientNo;
    @FXML
    private TableColumn<New_Patient,String> assignPatientName;
    @FXML
    private TableColumn<New_Patient,String> assignPatientGender;
    @FXML
    private TableView<New_Patient> patientAssignmentTableView;
    @FXML
    private TableColumn<New_Patient, String> assignPatientDetails;    
    @FXML
    private Button logout;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        assignPatientNo.setCellValueFactory(new PropertyValueFactory<New_Patient, Integer>("PatientNo"));
        assignPatientName.setCellValueFactory(new PropertyValueFactory<New_Patient, String>("PatientName"));
        assignPatientGender.setCellValueFactory(new PropertyValueFactory<New_Patient,String>("PatientGender"));
        assignPatientDetails.setCellValueFactory(new PropertyValueFactory<New_Patient, String>("PatientDetails"));
    }   


    @FXML
    private void newPatientLoadOnClick(ActionEvent event) {
       New_Patient c1 = new New_Patient(1001,"James","Male","Fever");
       New_Patient c2 = new New_Patient(1002,"Thomas","Male","Emergency");
       New_Patient c3 = new New_Patient(1003,"Jack","Male","Operation");
       New_Patient c4 = new New_Patient(1004,"Henry","Female","Hard Injury");
       New_Patient c5 = new New_Patient(1005,"Emma","Female","Doctor Meet");
       
        ObservableList<New_Patient> patientList  = FXCollections.observableArrayList(); //FX not Fx
        System.out.println(patientList);
        patientList.add(c1);
        patientList.add(c2);
        patientList.add(c3);
        patientList.add(c4);
        patientList.add(c5);
        patientAssignmentTableView.setItems(patientList);   //add on list
        System.out.println(patientList);
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
