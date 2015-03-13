/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youtubedl;

/**
 *
 * @author Manash
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.List;
import javax.script.Bindings;
import javax.script.*;


public class Download {
    public String command;
    public String outputString;
    
    
    
    public static void executeCommand(String link) throws IOException{
        
        char[] prog = new char[4];
        float progress;
        String progString;
        
        char speed[] = new char[10];
        ProcessBuilder builder = new ProcessBuilder(
                "cmd.exe",
                "/c",
                "youtube-dl "
                + link
        );
        
        builder.redirectErrorStream(true);
        
        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        while (true){
            
            line = r.readLine();
            if (line == null) break;
            System.out.println(line);
            
            if (line.contains("KiB/s")){
                int j = line.indexOf("KiB/s");
                
                for (int i = line.indexOf("at") + 2, k = 0; i!=j; i++, k++){
                    speed[k] = line.charAt(i);
                }
                
                String speedString = new String(speed);
                
                System.out.println("Speed: " + speedString);
                
                //Getting the location of progress
                int downloadIndex = line.indexOf("[download]");
                int percentageIndex = line.indexOf("%");
                
                
                System.out.print("Index of progress: ");
                System.out.println(downloadIndex);
                System.out.print("Index of %: ");
                System.out.println(percentageIndex);
                
                if (line.contains("[download]")){
                    for (int i = 13, index = 0; i < 16; i++, index++){
                        prog[index] = line.charAt(i);
                    }
                }
                
                progString = new String(prog);
                progress = Float.parseFloat(progString);
               
                
                //System.out.println(line.charAt(12));
                System.out.print("Progress parsed as float: ");
                System.out.println(progress);
                
                System.out.println();
            }
        }
    }
}
