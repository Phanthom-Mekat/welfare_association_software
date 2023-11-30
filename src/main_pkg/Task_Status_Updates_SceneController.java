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
public class Task_Status_Updates_SceneController implements Initializable {
    @FXML
    private Button logout;// acceptedTaskNo;
    @FXML
    private TableView<Task>  acceptedTaskTable;// acceptedTaskName;
    @FXML
    private TableColumn<Task, Integer>  acceptedTaskNo;// acceptedTaskStatus;
    @FXML
    private TableColumn<Task, String> acceptedTaskName;//acceptedTaskTable;
    @FXML
    private TableColumn<Task, String> acceptedTaskStatus;

    public void setData(Task selectedTask) {
        // Populate data in tableView using selectedPerson
       acceptedTaskTable.getItems().add(selectedTask);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
       
//        acceptedTaskNo.setCellValueFactory(new PropertyValueFactory<Accepted_Task, Integer>("Task"));
//        acceptedTaskName.setCellValueFactory(new PropertyValueFactory<Accepted_Task, String>("TaskName"));
//        acceptedTaskStatus.setCellValueFactory(new PropertyValueFactory<Accepted_Task,String>("TaskStatus"));
//        
//
//    }    
//
//    @FXML
    @FXML
    private void loadTaskOnClick(ActionEvent event) {
    }
//       Accepted_Task c1 = new Accepted_Task(123,"Sweing","accepted");
//       Accepted_Task c2 = new Accepted_Task(456,"Cut Off","accepted");
//       Accepted_Task c3 = new Accepted_Task(567,"Supply","pending");
//       Accepted_Task c4 = new Accepted_Task(678,"New","completed");
//       Accepted_Task c5 = new Accepted_Task(789,"Submit Only","completed");
//       
//       ObservableList<Accepted_Task> acceptedtaskList  = FXCollections.observableArrayList(); //FX not Fx
//       System.out.println(acceptedtaskList);
//       acceptedtaskList.add(c1);
//       acceptedtaskList.add(c2);
//       acceptedtaskList.add(c3);
//       acceptedtaskList.add(c4);
//       acceptedtaskList.add(c5);
//       acceptedTaskTable.setItems(acceptedtaskList);   //add on list
//       System.out.println(acceptedtaskList);     
//        
//    }

    @FXML
    private void backButtonOnClick(ActionEvent event)throws IOException {
        try {


        FXMLLoader loader = new FXMLLoader(getClass().getResource("User_7_WelcomePage.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        Stage currentStage = (Stage) logout.getScene().getWindow();
        currentStage.setScene(scene);
    } catch (IOException e) {
        e.printStackTrace();
    }

 
}
}
