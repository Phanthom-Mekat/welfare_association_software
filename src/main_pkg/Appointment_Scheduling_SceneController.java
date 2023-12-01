/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main_pkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class Appointment_Scheduling_SceneController implements Initializable {

    @FXML
    private TableView<Patient> appointmentScheduleTableView;
    @FXML
    private TableColumn<Patient,Integer> patientSerialNofxid;
    @FXML
    private TableColumn<Patient,String> patientNamefxid;
    @FXML
    private TableColumn<Patient,String> appointmentDatefxid;
    @FXML
    private TableColumn<Patient,String> appointTimefxid;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addNewAppointOnClick(ActionEvent event) {
    }

    private static class Patient {

        public Patient() {
        }
    }
    
}
