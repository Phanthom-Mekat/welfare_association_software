package main_pkg;

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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


public class User_3_ShowFeedbackController implements Initializable {

    @FXML
    private TableView<Feedback> feedbackTableView;
    @FXML
    private TableColumn<Feedback, String> feedbackName;
    @FXML
    private TableColumn<Feedback, Integer> feedbackNumber;
    @FXML
    private TableColumn<Feedback, String> feedbackText;
    @FXML
    private Button logout;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        feedbackName.setCellValueFactory(new PropertyValueFactory<Feedback,String>("feedbackName"));
        feedbackNumber.setCellValueFactory(new PropertyValueFactory<Feedback,Integer>("feedbackNumber"));
        feedbackText.setCellValueFactory(new PropertyValueFactory<Feedback,String>("feedbackText"));
        
    }    

    @FXML
    private void loadFeedback(ActionEvent event) throws IOException{
        ObservableList<Feedback> feedbackList = FXCollections.observableArrayList();
        feedbackTableView.setPlaceholder(new Label(""));
        File f = null;
        FileInputStream fis = null;
        DataInputStream dis = null;
        String str="";

        
        try {
            f = new File("Feedback.bin");
            if(!f.exists()){
                feedbackTableView.setPlaceholder(new Label("Oops! Feedback.bin binary file does not exist..."));
            }
            else{
                fis = new FileInputStream(f);
                dis = new DataInputStream(fis);
               
                while (dis.available() > 0) {
                    System.out.println("n!");
                    String name = dis.readUTF();
                    System.out.println("numb!");
                    int number = dis.readInt();
                    System.out.println("d");
                    String feedbacktext = dis.readUTF();
  
 
            Feedback feedback = new Feedback(name,number,feedbacktext);
            feedbackList.add(feedback);
                }
                feedbackTableView.setItems(feedbackList);
            }
        } catch (IOException ex) {
            Logger.getLogger(User_3_ShowFeedbackController.class.getName()).log(Level.SEVERE, null, ex); 
            Label errorMessage = new Label("An error occurred while loading tasks.");
             feedbackTableView.setPlaceholder(errorMessage);

        } finally {
            try {
                if(dis != null) dis.close();
            } catch (IOException ex) {
                Logger.getLogger(User_3_ShowFeedbackController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
        
        
    }

    @FXML
    private void backOnClick(ActionEvent event)throws IOException {
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
