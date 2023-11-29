/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main_pkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

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
    private TableColumn<New_Patient,String> PatientGender;
    @FXML
    private TableView<New_Patient> patientAssignmentTableView;
    @FXML
    private Button logout;
    @FXML
    private TableColumn<?, ?> assignPatientDetails;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        assignPatientNo.setCellValueFactory(new PropertyValueFactory<New_Patient, Integer>("PatientNo"));
        assignPatientName.setCellValueFactory(new PropertyValueFactory<New_Patient, String>("PatientName"));
        assignPatientGender.setCellValueFactory(new PropertyValueFactory<New_Patient,String>("PatientGender"));
        PatientGender.setCellValueFactory(new PropertyValueFactory<New_Patient, String>("TaskOption"));
    }   

    @FXML
    private void addNewPatientOnClick(ActionEvent event) {
    }

    @FXML
    private void newPatientLoadOnClick(ActionEvent event) {
       New_Patient c1 = new New_Patient(123,"James","Male","Y/N");
       New_Patient c2 = new New_Patient(456,"Thomas","Male","Y/N");
       New_Patient c3 = new New_Patient(567,"Jack","Male","Y/N");
       New_Patient c4 = new New_Patient(678,"Henry","Female","Y/N");
       New_Patient c5 = new New_Patient(789,"Emma","Female","Y/N");
       
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
    }

}
