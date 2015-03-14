/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuckingwithprogressbar;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.TextArea;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.GridPane;
import java.lang.Runnable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.Observable;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;


/**
 *
 * @author Manash
 */
public class FuckingWithProgressBar extends Application {
    static double x = 0.0;
    public static String line = "";
    public static double parsedDouble = 0.0;
    
    public static  ProgressBar bar = new ProgressBar();
    @Override
    public void start(Stage primaryStage) {
        
      final GridPane pane = new GridPane();
      final  TextArea text = new TextArea();
      
        
        
        //String line;
        
        Button btn = new Button("Click To Set");
        DoubleProperty doubleNumber = new SimpleDoubleProperty();
        
        
        doubleNumber.addListener(ov->{
            System.out.println("The new value is: " + doubleNumber.doubleValue());
            bar.setProgress(x);
        });
        
       
        
        pane.add(text, 0, 0);
        pane.add(bar, 0,2);
        pane.add(btn,0 , 1);
        
        
        pane.getChildren().addAll();
        
        btn.setOnAction((e) -> {
         line = text.getText();
         x = Double.parseDouble(line);
         doubleNumber.set(x);
    });

        
        
        
        
        
        Scene scene = new Scene(pane, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}


