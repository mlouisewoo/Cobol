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
 *SaveJson is a class that contains methods to save a user's data to a JSON file
 * @author All
 */
public class SaveJson {
    
    /**
    *Saves a user's basic information to a JSON file.
    *@param usr a UserInfo object containing user's information
    */
    public static void saveUser(UserInfo usr){
        String saving_folder = ""; 
        //generate filename using username
        String filename = saving_folder + usr.getName().replaceAll("\\s", "").toLowerCase() + ".json";
        
        FileWriter out;
        try{
            out = new FileWriter(filename);
            System.out.println("Writing user data to file: "+filename);
            
            
            String json = "{";
            json += "\t\""+LocalDateTime.now()+"\": {\n";
            json += "\t\"weight\": "; json += String.valueOf(usr.getWeight()); json += ",\n";
            json += "\t\"height\": "; json += String.valueOf(usr.getHeight()); json += ",\n";
            json += "\t\"age\": "; json += String.valueOf(usr.getAge()); json += ",\n";
            json += "\t\"sex\": \""; json += usr.getSex(); json += "\",\n";
            json += "\t\"gender\": \""; json += usr.getGender(); json += "\"\n";
            json += "}";
            
            out.write(json);
            
            out.close();
        }
        catch (IOException e) {
            System.out.println("Error in SaveDailyData.saveData. Could not write to file.");
        }
        
    
    }//saveuser
    
    
    /**
    *Saves a user's daily data to a JSON file.
    *@param usr a UserInfo object containing user's information
    *@param cal the user's daily calorie intake
    *@param prot the user's daily protein intake
    *@param carb the user's daily carbohydrate intake
    *@param fat the user's daily fat intake
    */
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

            out.close();
              
        }
        catch (IOException e) {
            System.out.println("Error in SaveDailyData.saveData. Could not write to file.");
        }
        
    
    }//savedaily
    
    
    /**
    *Saves a user's weight information to a JSON file.
    *@param usr a UserInfo object containing user's information
    */
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
