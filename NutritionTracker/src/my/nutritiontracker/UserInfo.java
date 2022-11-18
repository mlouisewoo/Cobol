/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.nutritiontracker;

/**
 *
 * @author kevin
 */
public class UserInfo {
    //** UserInfo Class */
    private double weight;
    private double height; 
    private double age;
    private String sex;
    
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight =weight;
    }
    public double getHeight(){
        return weight;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getAge(){
        return age;
    }
    public void setAge(double age){
        this.age = age;
    }
    public String getSex(){
        return sex;
    }
    public void setSex(String sex){
        this.sex = sex;
    }

    public UserInfo(double weight, double height, double age, String sex){
        //* UserInfo class takes in 4 parameters from our User*/
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.sex = sex;
    }

    public double getCalories(){
        // ** returns recommended daily calorie intake using Mifflin-St Jeor Equation */
        double kilograms = weight * 0.454;
        double cent = height * 2.54;
        double totalCal;
        if(sex == "Male"){
            totalCal = (1.2 * ((10 * kilograms) + (6.25 * cent) - (5 * age) + 5));
        } else{
            totalCal = (1.2 * ((10 * kilograms) + (6.25 * cent) - (5 * age) - 161));
        }
        
        return totalCal;
    }


    public double getProtein(){
        // ** returns daily protein intake based on 25 percent of you daily caloric intake */
        double kilograms = weight * 0.454;
        double cent = height * 2.54;
        double totalProtien;
        if(sex == "Male"){
            totalProtien = (1.2 * ((10 * kilograms) + (6.25 * cent) - (5 * age) + 5)) * 0.25 / 4;
        } else{
            totalProtien = (1.2 * ((10 * kilograms) + (6.25 * cent) - (5 * age) - 161)) * 0.25 / 4;
        }
        return totalProtien;
    }

    public double getCarbs(){
        // ** returns daily carboydrate intake based on 40 percent of you daily caloric intake */
        double kilograms = weight * 0.454;
        double cent = height * 2.54;
        double totalCarbs;
        if(sex == "Male"){
            totalCarbs = (1.2 * ((10 * kilograms) + (6.25 * cent) - (5 * age) + 5)) * 0.40 / 4;
        } else{
            totalCarbs = (1.2 * ((10 * kilograms) + (6.25 * cent) - (5 * age) - 161)) * 0.40 / 4;
        }
        return totalCarbs;
    }

    public double getFat(){
        // ** returns daily Fat intake based on 35 percent of you daily caloric intake */

        double kilograms = weight * 0.454;
        double cent = height * 2.54;
        double totalFat;
        if(sex == "Male"){
            totalFat = (1.2 * ((10 * kilograms) + (6.25 * cent) - (5 * age) + 5)) * 0.35 / 9;
        } else{
            totalFat = (1.2 * ((10 * kilograms) + (6.25 * cent) - (5 * age) - 161)) * 0.35 / 9;
        }
        return totalFat;
    }
}
