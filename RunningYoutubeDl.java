/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youtubedl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Manash
 */
public class RunningYoutubeDl {
    public String command;
    public String outputString;
    
    public String executeCommand(String link) throws IOException
    {
        ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "youtube-dl " + link);
        builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        while (true)
        {
            outputString = r.readLine();
            if (outputString == null) break;
            System.out.println(outputString);
        }
        return outputString;
    }
    
}
