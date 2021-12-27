/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Joseph Charland
 */
public class LabAssign6_Charland extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        BorderPane pane = new BorderPane();
        
        //h & v box
        VBox vBox = new VBox();
        HBox hBox1 = new HBox();
        HBox hBox2 = new HBox();
        
        //top of the pane (vbox)
        Text title = new Text("Click a Sports Moment!");
        title.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 40));
        
        TextField tf = new TextField("");
        tf.setEditable(false);
     
        //Images for hb1
        Image frazier = new Image("https://trophylives.files.wordpress.com/2015/01/foreman-frazier.jpg?w=641&h=590&crop=1", 150, 150, false, false);
        Image miracle = new Image("https://wnyt.com/wnytimages/repository/2020-02/miracle-on-ice-lake-placid.jpg", 150, 150, false, false);
        
        //images for hb2
        Image fieldGoal = new Image("https://auburntigers.com/images/2013/11/30//9511224.jpeg", 150, 150, false, false);
        Image tiger = new Image("https://www.golfchannel.com/sites/default/files/2016/04/05/woods_1920_masters97_win_fistpump.jpg", 150, 150, false, false);
        //frazier button
        Button frazierBtn = new Button();
        frazierBtn.setGraphic(new ImageView(frazier));
        
        frazierBtn.setOnAction((ActionEvent event) -> {
            buttonPressed(tf, "George Foreman vs. Joe Frazier", "Down Goes Frazier, Down Goes Frazier, Down Goes Frazier!");
        });
        
        //miracle on ice button
        Button miracleBtn = new Button();
        miracleBtn.setGraphic(new ImageView(miracle));
        
        miracleBtn.setOnAction((ActionEvent event) -> {
            buttonPressed(tf, "The Miracle on Ice", "Do you believe in Miracles?!");
        });
        
        Button fieldGoalBtn = new Button();
        fieldGoalBtn.setGraphic(new ImageView(fieldGoal));
        
        fieldGoalBtn.setOnAction((ActionEvent event) -> {
            buttonPressed(tf, "2013 Iron Bowl", "They’re not gonna keep ‘em off the field tonight!");
        });
        
        //Tiger Woods
        Button tigerBtn = new Button();
        tigerBtn.setGraphic(new ImageView(tiger));
        
        tigerBtn.setOnAction((ActionEvent event) -> {
            buttonPressed(tf, "The 1997 Masters", "There it is…a win for the ages.");
        });
        
        
        //add content to the pane
        
        //add items to the vbox
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(10);
        vBox.getChildren().addAll(title, tf);
        
        //add items to hbox1
        hBox1.getChildren().addAll(frazierBtn, miracleBtn);
        hBox1.setSpacing(160);
        
        //add items to hbox2
        hBox2.getChildren().addAll(fieldGoalBtn, tigerBtn);
        hBox2.setSpacing(160);
        
        
        
        //add items to pane
        pane.setTop(vBox);
        pane.setCenter(hBox1);
        pane.setBottom(hBox2);
        
        
        Scene scene = new Scene(pane);
        
        primaryStage.setTitle("Famous Sports Moments");
        primaryStage.setScene(scene);
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    //when button is pressed, we call this method
    public void buttonPressed(TextField tf, String sportsMoment, String m) {
        tf.setText(sportsMoment);
        System.out.println(sportsMoment + ": " + m);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
