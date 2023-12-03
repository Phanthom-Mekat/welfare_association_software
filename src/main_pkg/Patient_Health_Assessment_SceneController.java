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
public class Patient_Health_Assessment_SceneController implements Initializable {

    @FXML
    private TableView<Assigned_Patients> patientHealthAssessmentTable;
    @FXML
    private TableColumn<Assigned_Patients,Integer> patientNofxid;
    @FXML
    private TableColumn<Assigned_Patients,String> patientNamefxid;
    @FXML
    private TableColumn<Assigned_Patients,String> patientGenderfxid;
    @FXML
    private TableColumn<Assigned_Patients,String> patientDetailsUpdatefxid;
    @FXML
    private Button logout;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        patientNofxid.setCellValueFactory(new PropertyValueFactory<Assigned_Patients, Integer>("PatientNo"));
        patientNamefxid.setCellValueFactory(new PropertyValueFactory<Assigned_Patients, String>("PatientName"));
        patientGenderfxid.setCellValueFactory(new PropertyValueFactory<Assigned_Patients, String>("PatientGender"));
        patientDetailsUpdatefxid.setCellValueFactory(new PropertyValueFactory<Assigned_Patients,String>("PatientDetailsUpdate"));

    }    

    @FXML
    private void updateNowButtonOnClick(ActionEvent event) {
    
       Assigned_Patients c1 = new Assigned_Patients(123,"Rajeev","Male","Need to bed rest for 3 days");      
       Assigned_Patients c2 = new Assigned_Patients(456,"Suresh","Male","Urgent to Show x-ray Reports");
       Assigned_Patients c3 = new Assigned_Patients(567,"Meena","Female","Take Napa for 2 times");
       Assigned_Patients c4 = new Assigned_Patients(678,"Rony","Male","Ready to discharge");
       Assigned_Patients c5 = new Assigned_Patients(789,"Jara","Female","Need saline");
       
       ObservableList<Assigned_Patients> assignedPatientList  = FXCollections.observableArrayList(); 
       System.out.println(assignedPatientList);
       assignedPatientList.add(c1);
       assignedPatientList.add(c2);
       assignedPatientList.add(c3);
       assignedPatientList.add(c4);       
       assignedPatientList.add(c5);
       patientHealthAssessmentTable.setItems(assignedPatientList);   
       System.out.println(assignedPatientList);     
        
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
