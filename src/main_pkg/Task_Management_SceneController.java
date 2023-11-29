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
public class Task_Management_SceneController implements Initializable {

    @FXML
    private TableView<Task> newTaskTable;
    @FXML
    private TableColumn<Task,Integer> newTaskNo;
    @FXML
    private TableColumn<Task,String> newTaskName;
    @FXML
    private TableColumn<Task,String> newTaskDetails;
    @FXML
    private TableColumn<Task,String> addTaskOption;
    @FXML
    private Button logout;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        newTaskNo.setCellValueFactory(new PropertyValueFactory<Task, Integer>("TaskNo"));
        newTaskName.setCellValueFactory(new PropertyValueFactory<Task, String>("TaskName"));
        newTaskDetails.setCellValueFactory(new PropertyValueFactory<Task,String>("TaskDetails"));
        addTaskOption.setCellValueFactory(new PropertyValueFactory<Task, String>("TaskOption"));
    }    

    @FXML
    private void loadtasksOnClick(ActionEvent event) {
       Task c1 = new Task(123,"Sweing","abcd","Y/N");
       Task c2 = new Task(456,"Cut Off","bcde","Y/N");
       Task c3 = new Task(567,"Supply","cdef","Y/N");
       Task c4 = new Task(678,"New","defg","Y/N");
       Task c5 = new Task(789,"Submit Only","efgh","Y/N");
       
        ObservableList<Task> taskList  = FXCollections.observableArrayList(); //FX not Fx
        System.out.println(taskList);
        taskList.add(c1);
        taskList.add(c2);
        taskList.add(c3);
        taskList.add(c4);
        taskList.add(c5);
        newTaskTable.setItems(taskList);   //add on list
        System.out.println(taskList);
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) {
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
