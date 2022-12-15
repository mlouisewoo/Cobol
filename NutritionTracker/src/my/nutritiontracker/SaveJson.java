/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.nutritiontracker;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.io.BufferedWriter;

/**
 *
 * @author All
 */
public class SaveJson {
    
    
    public static void saveUser(UserInfo usr){
        String saving_folder = ""; //temp dir solution
        //generate filename using username
        String filename = saving_folder + usr.getName().replaceAll("\\s", "").toLowerCase() + ".json";
        
        FileWriter out;
        try{
            out = new FileWriter(filename);
            System.out.println("Writing user data to file: "+filename);
            
            
            String json = "{";
            //Name needed to be added here
            json += "\t\""+LocalDateTime.now()+"\": {\n";
            json += "\t\"weight\": "; json += String.valueOf(usr.getWeight()); json += ",\n";
            json += "\t\"height\": "; json += String.valueOf(usr.getHeight()); json += ",\n";
            json += "\t\"age\": "; json += String.valueOf(usr.getAge()); json += ",\n";
            json += "\t\"sex\": \""; json += usr.getSex(); json += "\",\n";
            json += "\t\"gender\": \""; json += usr.getGender(); json += "\"\n";
            json += "}";
            
            
            out.write(json);
            
            //TODO: Write the last output file
            
            out.close();
                 
            
            
        }
        catch (IOException e) {
            System.out.println("Error in SaveDailyData.saveData. Could not write to file.");
        }
        
    
    }//saveuser
    
    
    
    
    
    
    public static void saveDaily(UserInfo usr, double cal, double prot, double carb, double fat){
        String saving_folder = ""; //temp dir solution
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
            
            String jstr = "{\n\t\"cal\":"+String.valueOf(cal)+",\n\t\"prot\":"+String.valueOf(prot)+",\n\t\"carb\":"+String.valueOf(carb)+",\n\t\"fat\":"+String.valueOf(fat)+"\n}";
            System.out.println(jstr);
            out.write(jstr);
            
            //place for writing DailyProgress with the DailyJson class.
            
            //TODO: Write the last output file
            
            out.close();
                 
            
            
        }
        catch (IOException e) {
            System.out.println("Error in SaveDailyData.saveData. Could not write to file.");
        }
        
    
    }//savedaily
    
    
    
    public static void saveWeight(UserInfo usr){
        String saving_folder = "";
        //generate filename using username
        String filename = saving_folder + usr.getName().replaceAll("\\s", "").toLowerCase() + "_weight.json";
        
        BufferedWriter out;
        try{
            out = new BufferedWriter(new FileWriter(filename, true)); //append the json data string 
            
            String json = "";
            json += "\""+LocalDateTime.now().toString().split("T")[0]   +"\": {\n";
            json += "\t\"weight\": "; json += String.valueOf(usr.getWeight()); json += ",\n";
            json += "}\n";
            out.write(json);
            out.close();
        }catch(IOException e){
            System.out.println("Error in: my.nutritiontracker.SaveJson.saveWeight()");
        }
    
    
    }
    
    
    
}
