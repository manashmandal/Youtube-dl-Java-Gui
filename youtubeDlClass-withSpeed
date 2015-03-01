/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningpython;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.List;
import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/**
 *
 * @author Manash
 */
public class RunningPython {
    
    
    

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException  {
        char speed[]  = new char[10];
        
       ProcessBuilder builder = new ProcessBuilder(
            "cmd.exe", "/c", "youtube-dl \"https://www.youtube.com/watch?v=HoYv1H6-E98\"");
        builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        while (true) {
            line = r.readLine();
            if (line == null) { break; }
            System.out.println(line);
            
            if (line.contains("KiB/s")){
                int j = line.indexOf("KiB/s");
                for (int i = line.indexOf("at") + 2, k =0 ; i!=j;i++, k++){
                    speed[k] = line.charAt(i);
                }
                String speedString = new String(speed);
                System.out.println("Speed: " + speedString);
                
               // System.out.println("Inside the contains loop,  " + (line.charAt(line.indexOf("at"))) );
            }
            
         
        }
        
        
        
        // TODO code application logic here
    }
    
}
