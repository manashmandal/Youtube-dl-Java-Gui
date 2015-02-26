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
    //Added youtube-dl in the build directory
    // 
    
    public static void main(String[] args) throws IOException  {
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
        }
        
        
        
        // TODO code application logic here
    }
    
}
