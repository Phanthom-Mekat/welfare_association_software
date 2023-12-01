package main_pkg;


import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DCL
 */
public class User_3_ViewInterviewController implements Initializable {

    @FXML
    private TableView<Interview> tableview;
    @FXML
    private TableColumn<Interview, LocalDate> timeTableColumn;
    @FXML
    private TableColumn<Interview, String> interviewerNameCol;
    @FXML
    private TableColumn<Interview, String> mediaNameCol;
    @FXML
    private TableColumn<Interview, String> purposeCol;
    @FXML
    private TableColumn<Interview,String> durationCol;
    @FXML
    private Button logout;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        interviewerNameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        mediaNameCol.setCellValueFactory(new PropertyValueFactory<>("media"));
        timeTableColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        purposeCol.setCellValueFactory(new PropertyValueFactory<>("purpose"));
        durationCol.setCellValueFactory(new PropertyValueFactory<>("duration"));
        
    }    

    @FXML
    private void checkappoinmentButtonOnClick(ActionEvent event) {
        ObservableList<Interview> interviewList = FXCollections.observableArrayList();
        tableview.setPlaceholder(new Label(""));
        File f = null;
        FileInputStream fis = null;
        DataInputStream dis = null;
        String str="";
        int MAX_STRING_LENGTH = 0;
        
        try {
            f = new File("Interview.bin");
            if(!f.exists()){
                tableview.setPlaceholder(new Label("Oops! Interview.bin binary file does not exist..."));
            }
            else{
                int expectedBytesForOneWorker = 2 * Integer.BYTES + 4 * MAX_STRING_LENGTH;
                fis = new FileInputStream(f);
                dis = new DataInputStream(fis);
               
                while (dis.available() >= expectedBytesForOneWorker) {
                    String name = dis.readUTF();
                    String media = dis.readUTF();
                    String date = dis.readUTF();
                    String purpose = dis.readUTF();
                    int duration = dis.readInt();  
 
            Interview interview = new Interview(name,media,date,purpose,duration);
            interviewList.add(interview);
                }
                tableview.setItems(interviewList);
            }
        } catch (IOException ex) {
            Logger.getLogger(User_3_ViewInterviewController.class.getName()).log(Level.SEVERE, null, ex); 
            Label errorMessage = new Label("An error occurred while loading tasks.");
             tableview.setPlaceholder(errorMessage);

        } finally {
            try {
                if(dis != null) dis.close();
            } catch (IOException ex) {
                Logger.getLogger(User_3_ViewInterviewController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
        
        
    
        
        
    }

    @FXML
    private void backOnCLick(ActionEvent event) throws IOException{
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
