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


public class Patient_Discharge_Planning_SceneController implements Initializable {

    @FXML
    private TableView<Patient_List> patientDischargeTableView;
    @FXML
    private TableColumn<Patient_List,Integer> patientNofxid;
    @FXML
    private TableColumn<Patient_List,String> patientNamefxid;
    @FXML
    private TableColumn<Patient_List,String> patientGenderfxid;
    @FXML
    private TableColumn<Patient_List,String> patientConditionfxid;
    @FXML
    private Button logout;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        patientNofxid.setCellValueFactory(new PropertyValueFactory<Patient_List, Integer>("PatientNo"));
        patientNamefxid.setCellValueFactory(new PropertyValueFactory<Patient_List, String>("PatientName"));
        patientGenderfxid.setCellValueFactory(new PropertyValueFactory<Patient_List, String>("PatientGender"));
        patientConditionfxid.setCellValueFactory(new PropertyValueFactory<Patient_List,String>("PatientCondition"));   
    
    
       
       Patient_List c1 = new Patient_List(678,"Rony","Male","Ready to discharge");
       Patient_List c2 = new Patient_List(679,"Rina","Female","Ready to discharge");
       
       ObservableList<Patient_List> dischargePatientList  = FXCollections.observableArrayList(); 
       System.out.println(dischargePatientList);
       dischargePatientList.add(c1);   
       dischargePatientList.add(c2); 
       patientDischargeTableView.setItems(dischargePatientList);   
       System.out.println(dischargePatientList);     
                
    }
    @FXML
    private void dischargeNowButtonOnClick(ActionEvent event) {
    TableView<Patient_List> patientTableView;
    patientDischargeTableView.getItems().clear();  
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
    

    
