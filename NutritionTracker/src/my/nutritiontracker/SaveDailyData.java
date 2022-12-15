/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.nutritiontracker;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


/**
 *SaveDailyData class is used to save data about a users daily progress in
 * the nutrition tracker.
 * Class has a static method 'saveUser' that takes a 'UserInfo' object as a
 * parameter and saves it to a file.
 * @author Nick
 */
public class SaveDailyData {
    
    /**
     * Saves 'UserInfo' object to a file.
     * @param usr UserInfo object to save
     */
    public static void saveUser(UserInfo usr){
        String saving_folder = ""; //temp dir solution
        //generate filename using username
        String filename = saving_folder + usr.getName().replaceAll("\\s", "").toLowerCase() + ".json";
        

        FileWriter out;
        try{
            out = new FileWriter(filename);
            
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
            System.out.println("Error in SaveDailyData.saveData. Could not write to file.");
        }
        
    
    }//saveuser
    
    
    
    
    
    
    /*
    public static void saveDaily(UserInfo usr, double cal, double prot, double carb, double fat){
        String saving_folder = "C:\\Users\\Nick\\Desktop\\"; //temp dir solution
        //generate filename using username
        String filename = saving_folder + usr.getName().replaceAll("\\s", "").toLowerCase() + "_daily.json";
        

        FileWriter out;
        try{
            out = new FileWriter(filename);
            
            System.out.println("Writing user data to file: "+filename);
            
            //check if the file exists.  if not, start by adding a beginning parenthesis
            File f = new File(filename);
            if(!f.exists()){ //adding the start parenthesis
                //out.write("{");
            }
            else{ //remove trailing parenthesis
                //TODO: add last parenthesis {
            }
            
            out.write("{\n\tcal:"+String.valueOf(cal));
            
            //place for writing DailyProgress with the DailyJson class.
            
            //TODO: Write the last output file
            
            out.close();
                 
            
            
        }
        catch (IOException e) {
            System.out.println("Error in SaveDailyData.saveData. Could not write to file.");
        }
        
    
    }//savedaily
    
*/


}
