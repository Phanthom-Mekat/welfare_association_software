package main_pkg;

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
        Workers c1 = new Workers("mekat",23456789,"Worker","Worker","Male");
        Workers c2 = new Workers("Hossain",012345,"Worker","Worker","Male");
        Workers c3 = new Workers("Nirjhar",123534,"Worker","Worker","Male");
        Workers c4 = new Workers("Riyaj",1243,"Worker","Worker","Male");
        Workers c5 = new Workers("Tahmid",12343,"Worker","Worker","Male");
        Workers c6 = new Workers("Samin",3423,"Worker","Worker","Male");
        Workers c7 = new Workers("Maruf",423,"Worker","Pok","Male");
        
        
        
        ObservableList<Workers> workersList  = FXCollections.observableArrayList(); 
        System.out.println(workersList);
        workersList.add(c1);
        workersList.add(c2);
        workersList.add(c3);
        workersList.add(c4);
        workersList.add(c5);
        workersList.add(c6);
        workersList.add(c7);
        tableView.setItems(workersList);   //add on list
        System.out.println(workersList);
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
