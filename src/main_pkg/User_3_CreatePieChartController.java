/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main_pkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author DCL
 */
public class User_3_CreatePieChartController implements Initializable {

    @FXML
    private PieChart pieChart;
    @FXML
    private Button loadButton;
    @FXML
    private Label statusLabel;
   
    private ObservableList <PieChart.Data> list 
            = FXCollections.observableArrayList();
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Alert a = new Alert(Alert.AlertType.ERROR);
    }    

    @FXML
    private void loadButtonOnClick(ActionEvent event) {
        pieChart.getData().clear();
        list.add( new PieChart.Data("Designer",40));
        list.add( new PieChart.Data("C++",40) );
        list.add( new PieChart.Data("Python",30) );
        list.add( new PieChart.Data("C#",10) );
        list.add( new PieChart.Data("C",15) );        
        
        
        pieChart.setData(list);
        
        for(PieChart.Data data: pieChart.getData()){
            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, 
                new EventHandler<MouseEvent>(){
                    @Override
                    public void handle(MouseEvent event) {
                        statusLabel.setText(String.valueOf(data.getPieValue()));
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                }
            );
            
        }
    }
    
}
