/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.nutritiontracker;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;

/**
 * Takes in user data input and saves it as a JSON file for later retrieval
 * @author Madeleine Woo, Enrique Garza, Kevin Rodriguez, Nick Marencik
 */
public class SaveUserData {
    
    public static void saveData(UserInfo usr){
        String saving_folder = "C:\\Users\\Nick\\Desktop\\"; //temp dir solution
        //generate filename using username
        String filename = saving_folder + usr.getName().replaceAll("\\s", "").toLowerCase() + ".json";
        

        BufferedWriter out;
        try{
            out = new BufferedWriter(new FileWriter(filename, true));
            
            System.out.println("Writing user data to file: "+filename);
            
            //check if the file exists.  if not, start by adding a beginning parenthesis
            File f = new File(filename);
            if(!f.exists()){
                out.write("{");
            }
            else{ //remove trailing parenthesis
                //TODO: add last parenthesis {
            }
            
            out.write(UserJson.createJson(usr));
            //place for writing DailyProgress with the DailyJson class.
            
            
            
            
            //TODO: Write the last output file
            
            out.close();
        }
        catch (IOException e) {
            System.out.println("Error in SaveUserData.saveData. Could not write to file.");
        }
        
    
    }
    
    
}