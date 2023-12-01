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
public class Withdrawal_History_SceneController implements Initializable {

    @FXML
    private TableColumn<Withdraw,Integer> withdrawNo;
    @FXML
    private TableColumn<Withdraw,String> withdrawDate;
    @FXML
    private TableColumn<Withdraw,Integer> withdrawalAmount;
    @FXML
    private TableColumn<Withdraw,String> withdrawalNote;
    @FXML
    private Button logout;
    @FXML
    private TableView<Withdraw> withdrawTaskTable;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        withdrawNo.setCellValueFactory(new PropertyValueFactory<Withdraw, Integer>("WithdrawNo"));
        withdrawDate.setCellValueFactory(new PropertyValueFactory<Withdraw, String>("WithdrawalDate"));
        withdrawalAmount.setCellValueFactory(new PropertyValueFactory<Withdraw,Integer>("WithdrawalAmount"));
        withdrawalNote.setCellValueFactory(new PropertyValueFactory<Withdraw,String>("WithdrawalNote"));
    }    

    @FXML
    private void loadHistoryButtonOnClick(ActionEvent event) {
        Withdraw c1 = new Withdraw(123,"Sucessful",40000,"12-December-2022");
        Withdraw c2 = new Withdraw(124,"Sucessful",60000,"21-February-2022");
        Withdraw c3 = new Withdraw(125,"Sucessful",70000,"16-September-2021");
        Withdraw c4 = new Withdraw(126,"Sucessful",45000,"25-November-2021");
        Withdraw c5 = new Withdraw(127,"Sucessful",65000,"12-June-2023");
       
        ObservableList<Withdraw> withdrawkList  = FXCollections.observableArrayList(); //FX not Fx       
        withdrawkList.add(c1);
        withdrawkList.add(c2);
        withdrawkList.add(c3);
        withdrawkList.add(c4);
        withdrawkList.add(c5);
        withdrawTaskTable.setItems(withdrawkList);   //add on list
        System.out.println(withdrawkList);     
        
    }
    @FXML
    private void backButtonOnClick(ActionEvent event) {
        try {


        FXMLLoader loader = new FXMLLoader(getClass().getResource("Show_Earnings_Scene.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        Stage currentStage = (Stage) logout.getScene().getWindow();
        currentStage.setScene(scene);
    } catch (IOException e) {
        e.printStackTrace();
    }

 
}
    
}
