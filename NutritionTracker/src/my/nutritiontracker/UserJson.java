/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.nutritiontracker;
import java.time.LocalDateTime; 

/**
 * Converts UserData objects into a JSON string
 * @author Madeleine Woo, Enrique Garza, Kevin Rodriguez, Nick Marencik
 */
public class UserJson {
    /**
     * Creates a JSON string to represent the user's data.
     * 
     * @param usr
     * @return json
     */
    public static String createJson(UserInfo usr){
        String json = "{";
        //Name needed to be added here
        json += "\t\""+LocalDateTime.now()+"\": {\n";
        json += "\t\"weight\": "; json += String.valueOf(usr.getWeight()); json += ",\n";
        json += "\t\"height\": "; json += String.valueOf(usr.getHeight()); json += ",\n";
        json += "\t\"age\": "; json += String.valueOf(usr.getAge()); json += ",\n";
        json += "\t\"sex\": "; json += usr.getSex(); json += "\n";
        json += "},";
        return(json);
    }
    
    
}
