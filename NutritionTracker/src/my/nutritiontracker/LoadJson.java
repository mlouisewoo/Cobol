/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.nutritiontracker;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Nick
 */
public class LoadJson {
    
    /**
     * Loads the current daily carbs, fat, cal, protein from the file that contains it.
     * The argument is the string name of the current user.
     * 
     * @param name
     * @return 
     */
    
    public static DailyProgress loadDaily(String name){
        double dailyCal = 0.0;
        double dailyProtein = 0.0;
        double dailyCarbs = 0.0;
        double dailyFat = 0.0;
        
        String saving_folder = ""; //temp dir solution
        String filename = saving_folder + name.replaceAll("\\s", "").toLowerCase() + "_daily.json";
        System.out.println("Checking for file: "+filename);
        //check file for user exists
        //File f = new File(filename);
        //if(!f.exists()){ 
            System.out.println("I found the file!");
            try {
            File myObj = new File(filename);
             Scanner myReader = new Scanner(myObj);
             //while (myReader.hasNextLine()) {
                String data = myReader.nextLine(); //{
                dailyCal = Double.parseDouble( myReader.nextLine().replaceAll("\t\"cal\":", "").replaceAll(",", "") );
                dailyProtein = Double.parseDouble( myReader.nextLine().replaceAll("\t\"prot\":", "").replaceAll(",", "") );
                dailyCarbs    = Double.parseDouble( myReader.nextLine().replaceAll("\t\"carb\":", "").replaceAll(",", "") );
                dailyFat   = Double.parseDouble( myReader.nextLine().replaceAll("\t\"fat\":", "").replaceAll(",", "") );
                
              //}
                 myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("Could not find user file.");
           }
            DailyProgress prog = new DailyProgress(0, 0, 0,0, dailyCal, dailyProtein, dailyCarbs, dailyFat);
            return(prog);
    }
    
    
    
    
    
    
    
    /**
     * Loads in the users current info about weight, height, etc. and creates a UserInfo object for it
     * The argument input is the string name input for the user.
     * 
     * @param name
     * @return 
     */
    public static UserInfo loadUser(String name){
        String sex="", gender = "";
        double weight=0, height=0, age=0;
        
        
        String saving_folder = ""; //temp dir solution
        String filename = saving_folder + name.replaceAll("\\s", "").toLowerCase() + ".json";
        System.out.println("Checking for file: "+filename);
        //check file for user exists
        //File f = new File(filename);
        //if(!f.exists()){ 
            System.out.println("I found the file!");
            try {
            File myObj = new File(filename);
             Scanner myReader = new Scanner(myObj);
             //while (myReader.hasNextLine()) {
                String data = myReader.nextLine(); //{
                weight = Double.parseDouble( myReader.nextLine().replaceAll("\t\"weight\":", "").replaceAll(",", "") );
                height = Double.parseDouble( myReader.nextLine().replaceAll("\t\"height\":", "").replaceAll(",", "") );
                age    = Double.parseDouble( myReader.nextLine().replaceAll("\t\"age\":", "").replaceAll(",", "") );
                sex    = myReader.nextLine().replaceAll("\t\"sex\": ", "").replaceAll(",", "").replaceAll("\"", "") ;
                gender = myReader.nextLine().replaceAll("\t\"gender\": ", "").replaceAll(",", "").replaceAll("\"", "") ;
                System.out.println(weight +" " +height+" "+age+" "+sex+" "+gender);
              //}
                myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("Could not find user file.");
           }
            
            
            
            
        //}

            UserInfo usr = new UserInfo(name, weight, height, age, sex, gender);
            return(usr);
    }
    
    
    
    public static String loadWeightList(String name){
        String saving_folder = ""; //temp dir solution
        String filename = saving_folder + name.replaceAll("\\s", "").toLowerCase() + "_weight.json";
    
        String weight_string = "";
            try {
            File myObj = new File(filename);
             Scanner myReader = new Scanner(myObj);
             while (myReader.hasNextLine()) {
                String weight_date = myReader.nextLine().replace(": {", "");
                String weight = myReader.nextLine().replaceAll("\t\"weight\":", "").replaceAll(",", "");
                myReader.nextLine(); // skip over the closing brace
                weight_string += weight_date + "\t\t\t" + weight + "\n";
              }
        myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("Could not find user file.");
           }
        System.out.println("weight_string");
        return(weight_string);
    
    }
    
    
}
