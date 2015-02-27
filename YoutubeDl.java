/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youtubedl;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 *
 * @author Manash
 */
public class YoutubeDl extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        RunningYoutubeDl youtube_dl = new RunningYoutubeDl();
        String lnk = "\"https://www.youtube.com/watch?v=opji5DgE_nQ\"";
        
        
        Button btn = new Button();
        
        btn.setText("Say 'Hello World'");
        
        btn.setOnAction((ActionEvent event) -> {
            System.out.println("Hello World!");
            try {
                youtube_dl.executeCommand(lnk);
            } catch (IOException ex) {
                Logger.getLogger(YoutubeDl.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        StackPane root = new StackPane();
        
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
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
