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
public class Appointment_Scheduling_SceneController implements Initializable {

    @FXML
    private TableView<Doctor> appointmentScheduleTableView;
    @FXML
    private TableColumn<Doctor, Integer> doctorSerialNofxid;
    @FXML
    private TableColumn<Doctor, String> doctorNamefxid;    
    @FXML
    private TableColumn<Doctor,String> appointmentDatefxid;
    @FXML
    private TableColumn<Doctor,String> appointTimefxid;
    @FXML
    private Button logout;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        doctorSerialNofxid.setCellValueFactory(new PropertyValueFactory<Doctor, Integer>("DoctorSerial"));
        doctorNamefxid.setCellValueFactory(new PropertyValueFactory<Doctor, String>("DoctorName"));
        appointmentDatefxid.setCellValueFactory(new PropertyValueFactory<Doctor, String>("AppointmentDate"));
        appointTimefxid.setCellValueFactory(new PropertyValueFactory<Doctor,String>("AppointTime"));

    }    

    @FXML
    private void addNewAppointOnClick(ActionEvent event) {
    TableView<Doctor> appointmentTableView;
    appointmentScheduleTableView.getItems().clear();  
    }

    @FXML
    private void loadScheduleOnClick(ActionEvent event) {
       Doctor c1 = new Doctor(123,"DR. Rajeev","03-01-2024","Evening 7.00 PM to 10 PM");      
       Doctor c2 = new Doctor(124,"DR. Suresh","03-01-2024","Morning 10.00 AM to 1.00 PM");
       Doctor c3 = new Doctor(125,"DR. Meena","04-01-2024","Evening 4.00 PM to 8.00 PM");
       Doctor c4 = new Doctor(126,"DR. Rony","05-01-2024","Evening 7.00 PM to 10 PM");
       Doctor c5 = new Doctor(127,"DR. Jara","06-01-2024","Evening 2.00 PM to 5.00 PM");
       
       ObservableList<Doctor> DoctorList  = FXCollections.observableArrayList(); 
       System.out.println(DoctorList);
       DoctorList.add(c1);
       DoctorList.add(c2);
       DoctorList.add(c3);
       DoctorList.add(c4);       
       DoctorList.add(c5);
       appointmentScheduleTableView.setItems(DoctorList);   
       System.out.println(DoctorList);     
        
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
