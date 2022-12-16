package my.nutritiontracker;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 * Description: Tracks the daily progress of the user and how close they are to 
 * reaching nutrient goals
 * <pre>
 * Purpose: Tracks the daily progress of the user and how close they are to 
 * reaching nutrient goals
 * Course: COMP-305
 * </pre>
 * @author Madeleine Woo, Enrique Garza, Kevin Rodriguez, Nick Marencik
 * Date: Nov. 17, 2022
 */

/**
 *The DailyProgress class represents a user's daily progress in the nutrition tracker.
 *This class has a constructor that takes the following parameters:
 *@param calories The number of calories the user consumed
 *@param proteins The number of protein grams the user consumed
 *@param carbohydrates The number of carbohydrate grams the user consumed
 *@param fat The number of fat grams the user consumed
 *@param dailyCal The user's daily calorie goal
 *@param dailyProtein The user's daily protein goal
 *@param dailyCarbs The user's daily carbohydrate goal
 *@param dailyFat The user's daily fat goal
*/
public record DailyProgress(double calories, double proteins, double carbohydrates, double fat, double dailyCal, double dailyProtein, double dailyCarbs, double dailyFat) {
 
}
