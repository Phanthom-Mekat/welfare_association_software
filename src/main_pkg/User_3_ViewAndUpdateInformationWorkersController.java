
package main_pkg;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Optional;
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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
public class User_3_ViewAndUpdateInformationWorkersController implements Initializable {

    @FXML
    private TableView<Workers> tableView;
    @FXML
    private TableColumn<Workers, String> nameCol;
    @FXML
    private TableColumn<Workers, Integer> phoneCol;
    @FXML
    private TableColumn<Workers, String> detailsCol;
    @FXML
    private TableColumn<Workers, String> typeCol;
    @FXML
    private TableColumn<Workers, String> genderCol;
    @FXML
    private Button loadButton;
    @FXML
    private Button logout;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        nameCol.setCellValueFactory(new PropertyValueFactory<Workers,String>("name"));
        phoneCol.setCellValueFactory(new PropertyValueFactory<Workers,Integer>("phonenumber"));
        detailsCol.setCellValueFactory(new PropertyValueFactory<Workers,String>("details"));
        typeCol.setCellValueFactory(new PropertyValueFactory<Workers,String>("clientType"));
        genderCol.setCellValueFactory(new PropertyValueFactory<Workers,String>("gender"));
    }    

    @FXML
    private void loadButtonOnClick(ActionEvent event)throws IOException {
        ObservableList<Workers> workersList = FXCollections.observableArrayList();
        tableView.setPlaceholder(new Label(""));
        File f = null;
        FileInputStream fis = null;
        DataInputStream dis = null;
        String str="";
        int MAX_STRING_LENGTH = 0;
        
        try {
            f = new File("CompleteInformation1.bin");
            if(!f.exists()){
                tableView.setPlaceholder(new Label("Oops! CompleteInformation1.bin binary file does not exist..."));
            }
            else{
                int expectedBytesForOneWorker = 2 * Integer.BYTES + 4 * MAX_STRING_LENGTH;
                fis = new FileInputStream(f);
                dis = new DataInputStream(fis);
               
                while (dis.available() >= expectedBytesForOneWorker) {
                    String name = dis.readUTF();
                    int phonenumber = dis.readInt();
                    String details = dis.readUTF();
                    String clientType = dis.readUTF();
                    String gender = dis.readUTF();
  
 
            Workers worker = new Workers(name, phonenumber, details,clientType,gender);
            workersList.add(worker);
                }
                tableView.setItems(workersList);
            }
        } catch (IOException ex) {
            Logger.getLogger(User_3_ViewAndUpdateInformationWorkersController.class.getName()).log(Level.SEVERE, null, ex); 
            Label errorMessage = new Label("An error occurred while loading tasks.");
             tableView.setPlaceholder(errorMessage);

        } finally {
            try {
                if(dis != null) dis.close();
            } catch (IOException ex) {
                Logger.getLogger(User_3_ViewAndUpdateInformationWorkersController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        

    }


    @FXML
    private void backOnclick(ActionEvent event)throws IOException  {
        try {


        FXMLLoader loader = new FXMLLoader(getClass().getResource("User_3_WelcomePage.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        Stage currentStage = (Stage) logout.getScene().getWindow();
        currentStage.setScene(scene);
    } catch (IOException e) {
        e.printStackTrace();
    }       
        
    }

    @FXML
    private void logout(ActionEvent event) {
        try {


        FXMLLoader loader = new FXMLLoader(getClass().getResource("UserLogin.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        Stage currentStage = (Stage) logout.getScene().getWindow();
        currentStage.setScene(scene);
    } catch (IOException e) {
        e.printStackTrace();
    } 
    }
}
