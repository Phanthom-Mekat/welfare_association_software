/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main_pkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DCL
 */
public class User_3_ViewMediaController implements Initializable {

    @FXML
    private ComboBox<String> mediaComboBox;
    @FXML
    private ComboBox<Integer> selectDayComboBox;
    @FXML
    private Button logout;
    @FXML
    private TextArea textAreaNews;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
         mediaComboBox.getItems().addAll("BTV","GTV","Machranga","SomoyTV","EkuseyTV","Trust Me bro TV");
         selectDayComboBox.getItems().addAll(1, 2, 3, 7,30);
    }    

    @FXML
    private void loadNewsOnClick(ActionEvent event) {
    String selectedMedia = mediaComboBox.getValue();
    Integer selectedDay = selectDayComboBox.getValue();

    String news;

    if ("BTV".equals(selectedMedia)) {
        if (selectedDay == 1) {
            news = "Welfare Association News Garments on BTV, Day 1: Announcing the launch of our new clothing line.";
        } else if (selectedDay == 2) {
            news = "Welfare Association News Garments on BTV, Day 2: Exclusive interview with our lead designer about the latest fashion trends.";
        } else if (selectedDay == 3) {
            news = "Welfare Association News Garments on BTV, Day 3: Highlights from our recent fashion show event.";
        } else {
            news = "No news available for the selected media and day.";
        }
    } else if ("GTV".equals(selectedMedia)) {
        if (selectedDay == 1) {
            news = "Welfare Association News Garments on GTV, Day 1: Behind the scenes look at our garment production process.";
        } else if (selectedDay == 2) {
            news = "Welfare Association News Garments on GTV, Day 2: Showcase of our sustainable and eco-friendly clothing initiatives.";
        } else if (selectedDay == 3) {
            news = "Welfare Association News Garments on GTV, Day 3: Featured stories about our talented garment designers.";
        } else {
            news = "No news available for the selected media and day.";
        }
    } else if ("Machranga".equals(selectedMedia)) {
        if (selectedDay == 1) {
            news = "Welfare Association News Garments on Machranga, Day 1: Exciting discounts and promotions on our latest clothing collection.";
        } else if (selectedDay == 2) {
            news = "Welfare Association News Garments on Machranga, Day 2: Meet the models who represent Welfare Association's fashion diversity.";
        } else if (selectedDay == 3) {
            news = "Welfare Association News Garments on Machranga, Day 3: Showcasing our commitment to social responsibility in the fashion industry.";
        } else {
            news = "No news available for the selected media and day.";
        }
    } else {
        news = "No news available for the selected media and day.";
    }

    textAreaNews.setText(news);
        
    }

    @FXML
    private void backOnClick(ActionEvent event) {        
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
