package com.bob7up.blockalpha;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import com.bob7up.framework.FileIO;

public class Settings {
    
    // Create variables that will hold the values you want to save in your game.
    // Default values:
    
    public static boolean soundEnabled = true;
    public static int coins = 0;
    public static int currentLevel = 1;


   
    public static void save(FileIO files) {
        BufferedWriter out = null;
        try {
            
            // Writes a file called .savedata to the SD Card
            out = new BufferedWriter(new OutputStreamWriter(
                    files.writeFile(".savedata")));
            
            // Line by line ("\n" creates a new line), write the value of each variable to the file.
            out.write(Boolean.toString(soundEnabled));
            out.write("\n");
            
            out.write(Integer.toString(currentLevel));
            out.write("\n");
       
            out.write(Integer.toString(coins));
            out.write("\n");
            
           // This section handles errors in file management!
            
        } catch (IOException e) {
        } finally {
            try {
                if (out != null)
                    out.close();
            } catch (IOException e) {
            }
        }
    }
    
    public static void load(FileIO files) {
        BufferedReader in = null;
        try {
            // Reads file called Save Data
            in = new BufferedReader(new InputStreamReader(
                    files.readFile(".savedata")));

            // Loads values from the file and replaces default values.
            soundEnabled = Boolean.parseBoolean(in.readLine());
            currentLevel = Integer.parseInt(in.readLine());
            coins = Integer.parseInt(in.readLine());
            
        } catch (IOException e) {
            // Catches errors. Default values are used.
        } catch (NumberFormatException e) {
            // Catches errors. Default values are used.
        } finally {
            try {
                if (in != null)
                    in.close();
            } catch (IOException e) {
            }
        }
    }
}