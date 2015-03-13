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


public class YoutubeDl extends Application
{
    public void start(Stage stage){
        Download download = new Download();
        String lnk = "\"https://www.youtube.com/watch?v=opji5DgE_nQ\"";
        
        Button button = new Button("Click Meh");
        
        button.setOnAction((ActionEvent event) -> {
                System.out.println("Downloading: " + lnk);
                try{
                    download.executeCommand(lnk);
                } catch (IOException ex){
                    Logger.getLogger(YoutubeDl.class.getName()).log(Level.SEVERE, null, ex);
                }
        });
        
        
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 300, 300);
        root.getChildren().add(button);
        stage.setTitle("Click To download");
        stage.setScene(scene);
        stage.show();
        
    }
    
}
