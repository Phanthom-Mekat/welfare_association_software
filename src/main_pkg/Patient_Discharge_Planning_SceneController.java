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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void dischargeNowButtonOnClick(ActionEvent event) {
    }

    private static class Patient_List {

        public Patient_List() {
        }
    }
    
}
