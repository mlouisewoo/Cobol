/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.nutritiontracker;

/**
 * Converts DailyProgress objects to JSON.
 * @author Madeleine Woo, Enrique Garza, Kevin Rodriguez, Nick Marencik
 */
public class DailyJson {
    /**
     * Creates a JSON string to represent the user's daily stats.
     * 
     * @param usr
     * @return String json
     */
    public static String createJson(UserInfo usr){
        String json = "{";
        json += "\t\"today\": {\n";
        //vvv  NO DailyProgress IS IMPLEMENTED.  THIS IS A PLACEHOLDER. vvv
        json += "\t\"weight\": "; json += String.valueOf(usr.getWeight()); json += ",\n";
        json += "\t\"height\": "; json += String.valueOf(usr.getHeight()); json += ",\n";
        json += "\t\"age\": "; json += String.valueOf(usr.getAge()); json += ",\n";
        json += "\t\"sex\": "; json += usr.getSex(); json += "\n";
        json += "},";
        return(json);
    }
}
