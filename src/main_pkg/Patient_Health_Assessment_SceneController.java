/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main_pkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    private static class Assigned_Patients {

        public Assigned_Patients() {
        }
    }
    
}
