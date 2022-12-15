/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 * Description: Represents user info and includes setters and getters for user info
 * <pre>
 * Purpose: Represents user info and includes setters and getters for user info
 * Course: COMP-305
 * </pre>
 * @author Madeleine Woo, Enrique Garza, Kevin Rodriguez, Nick Marencik
 * Date: Nov. 17, 2022
 */
package my.nutritiontracker;

/**
 *
 * @author
 */
public class UserInfo {

    //** UserInfo Class */
    private String name;
    private double weight;
    private double height;
    private double age;
    private String sex;
    private String gender;

    /**
     * Returns user's name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the user name 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

   
    /**
     * Returns weight in pounds
     * @return weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets the weight 
     * @param weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Returns the height in inches
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height in inches
     * @param height 
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Returns the age in years
     * @return age
     */
    public double getAge() {
        return age;
    }

    /**
     * Sets the age in years
     * @param age 
     */
    public void setAge(double age) {
        this.age = age;
    }

    /**
     * returns the sex assigned at birth
     * as a string
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * sets the sex assigned at birth
     * @param sex 
     */
    public void setSex(String sex) {
        this.sex = sex;
    }
    
    /**
     * returns the gender
     * as a string
     * @return sex
     */
    public String getGender() {
        return gender;
    }

    /**
     * sets the gender
     * @param sex 
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    

    /**
     * @Purpose: UserInfo constructor
     * @param name
     * @param weight
     * @param height
     * @param age
     * @param sex
     */
    public UserInfo(String name, double weight, double height, double age, String sex, String gender) {
        //* UserInfo class takes in 4 parameters from our User*/
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.sex = sex;
        this.gender = gender;
    }
    /**
     *  
     * @Purpose: Calculates the total amount of Calories for daily goal
     * @return double totalCal
     */
    public double getCalories() {
        // ** returns recommended daily calorie intake using Mifflin-St Jeor Equation */
        double kilograms = weight * 0.454;
        double cent = height * 2.54;
        double totalCal;
        if (sex == "Male") {
            totalCal = (1.2 * ((10 * kilograms) + (6.25 * cent) - (5 * age) + 5));
        } else {
            totalCal = (1.2 * ((10 * kilograms) + (6.25 * cent) - (5 * age) - 161));
        }

        return totalCal;
    }
    /**
     * @Purpose Calculates the total amount of protein for daily goal
     * @return double totalProtein
     */
    public double getProtein() {
        // ** returns daily protein intake based on 25 percent of you daily caloric intake */
        double kilograms = weight * 0.454;
        double cent = height * 2.54;
        double totalProtein;
        if (sex == "Male") {
            totalProtein = (1.2 * ((10 * kilograms) + (6.25 * cent) - (5 * age) + 5)) * 0.25 / 4;
        } else {
            totalProtein = (1.2 * ((10 * kilograms) + (6.25 * cent) - (5 * age) - 161)) * 0.25 / 4;
        }
        return totalProtein;
    }
     /**
     * @Purpose Calculates the total amount of carbs for daily goal
     * @return double totalCarbs
     */
    public double getCarbs() {
        // ** returns daily carboydrate intake based on 40 percent of you daily caloric intake */
        double kilograms = weight * 0.454;
        double cent = height * 2.54;
        double totalCarbs;
        if (sex == "Male") {
            totalCarbs = (1.2 * ((10 * kilograms) + (6.25 * cent) - (5 * age) + 5)) * 0.40 / 4;
        } else {
            totalCarbs = (1.2 * ((10 * kilograms) + (6.25 * cent) - (5 * age) - 161)) * 0.40 / 4;
        }
        return totalCarbs;
    }
    /**
     * @Purpose Calculates the total amount of Fats for daily goal
     * @return double totalFats
     */
    public double getFat() {
        // ** returns daily Fat intake based on 35 percent of you daily caloric intake */

        double kilograms = weight * 0.454;
        double cent = height * 2.54;
        double totalFat;
        if (sex == "Male") {
            totalFat = (1.2 * ((10 * kilograms) + (6.25 * cent) - (5 * age) + 5)) * 0.35 / 9;
        } else {
            totalFat = (1.2 * ((10 * kilograms) + (6.25 * cent) - (5 * age) - 161)) * 0.35 / 9;
        }
        return totalFat;
    }
}
