/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main_pkg;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

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
    @FXML
    private Button logout;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Alert a = new Alert(Alert.AlertType.ERROR);
    }    

    @FXML
    private void loadButtonOnClick(ActionEvent event) {
//        pieChart.getData().clear();
//        list.add( new PieChart.Data("machineOperator",40));
//        list.add( new PieChart.Data("patternMaker",40) );
//        list.add( new PieChart.Data("cutters",100) );
//        list.add( new PieChart.Data("qualityControl",10) );
//        list.add( new PieChart.Data("textileDesigners",15) );        
//        
       ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList();

        try (DataInputStream dis = new DataInputStream(new FileInputStream("WorkerListSurvey.bin"))) {
            int machineOperatorCount = dis.readInt();
            int patternMakerCount = dis.readInt();
            int cuttersCount = dis.readInt();
            int qualityControlCount = dis.readInt();
            int textileDesignersCount = dis.readInt();

            pieChartData.add(new PieChart.Data("Machine Operator", machineOperatorCount));
            pieChartData.add(new PieChart.Data("Pattern Maker", patternMakerCount));
            pieChartData.add(new PieChart.Data("Cutters", cuttersCount));
            pieChartData.add(new PieChart.Data("Quality Control", qualityControlCount));
            pieChartData.add(new PieChart.Data("Textile Designers", textileDesignersCount));

        } catch (IOException ex) {
            Logger.getLogger(User_3_CreatePieChartController.class.getName()).log(Level.SEVERE, null, ex);
        }

        pieChart.setData(pieChartData);
           
//        pieChart.setData(list);
        
        for(PieChart.Data data: pieChart.getData()){
            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, 
                new EventHandler<MouseEvent>(){
                    @Override
                    public void handle(MouseEvent event) {
                        statusLabel.setText(String.valueOf(data.getPieValue()));
                    }
                }
            );
            
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
