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
public class Emergency_Alerts_SceneController implements Initializable {

    @FXML
    private TableView<Emergency> emergencyAlertsTableView;
    @FXML
    private TableColumn<Emergency,Integer> alertSerialNofxid;
    @FXML
    private TableColumn<Emergency,String> alertUserNamefxid;
    @FXML
    private TableColumn<Emergency,String> alertTypefxid;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loadAlertButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void goBackButtonOnClick(ActionEvent event) {
    }

    private static class Emergency {

        public Emergency() {
        }
    }
    
}
