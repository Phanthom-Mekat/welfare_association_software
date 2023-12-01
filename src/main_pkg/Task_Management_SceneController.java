
package main_pkg;
import javafx.scene.control.Label;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    private Button logout;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        newTaskNo.setCellValueFactory(new PropertyValueFactory<Task, Integer>("TaskNo"));
        newTaskName.setCellValueFactory(new PropertyValueFactory<Task, String>("TaskName"));
        newTaskDetails.setCellValueFactory(new PropertyValueFactory<Task,String>("TaskDetails"));

    }    

    @FXML
    private void loadtasksOnClick(ActionEvent event) {
        ObservableList<Task> taskList = FXCollections.observableArrayList();
        newTaskTable.setPlaceholder(new Label(""));
        File f = null;
        FileInputStream fis = null;
        DataInputStream dis = null;
        String str="";
        try {
            f = new File("NewTaskData.bin");
            if(!f.exists()){
                newTaskTable.setPlaceholder(new Label("Oops! NewTaskData.bin binary file does not exist..."));
            }
            else{
                fis = new FileInputStream(f);
                dis = new DataInputStream(fis);
                while (dis.available() > 0) {
                int taskNo = dis.readInt();
                String taskName = dis.readUTF();
                String taskDetails = dis.readUTF();

 
            Task task = new Task(taskNo, taskName, taskDetails);
            taskList.add(task);
                }
                newTaskTable.setItems(taskList);
            }
        } catch (IOException ex) {
            Logger.getLogger(Task_Management_SceneController.class.getName()).log(Level.SEVERE, null, ex); 
            Label errorMessage = new Label("An error occurred while loading tasks.");
             newTaskTable.setPlaceholder(errorMessage);

        } finally {
            try {
                if(dis != null) dis.close();
            } catch (IOException ex) {
                Logger.getLogger(Task_Management_SceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }          
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

    private void addTaskOnClick(ActionEvent event) throws IOException {
        
        Task selectedTask = newTaskTable.getSelectionModel().getSelectedItem();
        
//        // Switch to Scene2 and pass data to Controller2
////        FXMLLoader loader = new FXMLLoader(getClass().getResource("Task_Status_Updates_Scene.fxml"));
////        Parent root = loader.load();
//        Accepted_Task Accepted_Task = loader.getController();
        Task.setData(selectedTask);
      

        // Code to switch scenes...
    }
        
    
 
}
