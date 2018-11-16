/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package u2_a5_con_user.survey;

//import java
import java.util.Scanner; 


/**
 * Jacob Lacey
 * Nov 12, 2018
 * Practice using subroutines w/ param and return
 */
public class U2_A5_CON_UserSurvey {   
    
    /**
     * This method displays all of the possible questions
     */
    public static void introLaunch() {
        System.out.println("Welcome to the Super Duper Math M'Lader");
        System.out.println("Select a Calculation");
        System.out.println("\t(1) 2 Digit Addition");
        System.out.println("\t(2) 2 Digit Subtraction");
        System.out.println("\t(3) 2 Digit Multiplication");
        System.out.println("\t(4) 2 Digit Division");
        System.out.println("\t(5) 3 Digit Addition");
        System.out.println("\t(6) 3 Digit Subtraction");
        System.out.println("\t(7) 3 Digit Multiplication");
        System.out.println("\t(8) 3 Digit Division");
        System.out.println("\t(9) Digit Squared");
        System.out.println("\t(10) Digit Cubed");
    }
    
    /**
     * This method displays all of the possible questions
     * @param digit1 ~ The first digit
     * @param digit2 ~ The second digit
     * @return sum ~ The sum of d1 and d2
     */
    public static double twoDigitAdd(double digit1, double digit2) {
        //Scanner
        Scanner keyedInput = new Scanner(System.in);
        double sum;
        
        sum = digit1 + digit2;
        return sum;
    }
    
    /**
     * This method displays all of the possible questions
     * @param digit1 ~ The first digit
     * @param digit2 ~ The second digit
     * @return diff ~ The difference of d1 and d2
     */
    public static double twoDigitMinus(double digit1, double digit2) {
        //Scanner
        Scanner keyedInput = new Scanner(System.in);
        double dif;
        
        dif = digit1 - digit2;
        return dif;
    }
    
    /**
     * This method displays all of the possible questions
     * @param digit1 ~ The first digit
     * @param digit2 ~ The second digit
     * @return pro ~ The product of d1 and d2
     */
    public static double twoDigitProduct(double digit1, double digit2) {
        //Scanner
        Scanner keyedInput = new Scanner(System.in);
        double pro;
        
        pro = digit1 * digit2;
        return pro;
    }
    
    /**
     * This method displays all of the possible questions
     * @param digit1 ~ The first digit
     * @param digit2 ~ The second digit
     * @return quo ~ The quotient of d1 and d2
     */
    public static double twoDigitQuotient(double digit1, double digit2) {
        //Scanner
        Scanner keyedInput = new Scanner(System.in);
        double quo;
        
        quo = digit1 / digit2;
        return quo;
    }
    
    /**
     * This method displays all of the possible questions
     * @param digit1 ~ The first digit
     * @param digit2 ~ The second digit
     * @param digit3 ~ The third digit
     * @return sum ~ The sum of d1, d2 and d3
     */
    public static double threeDigitAdd(double digit1, double digit2, double digit3) {
        //Scanner
        Scanner keyedInput = new Scanner(System.in);
        double sum;
        
        sum = digit1 + digit2 + digit3;
        return sum;
    }
    
    /**
     * This method displays all of the possible questions
     * @param digit1 ~ The first digit
     * @param digit2 ~ The second digit
     * @param digit3 ~ The third digit
     * @return diff ~ The difference of d1, d2 and d3
     */
    public static double threeDigitMinus(double digit1, double digit2, double digit3) {
        //Scanner
        Scanner keyedInput = new Scanner(System.in);
        double diff;
        
        diff = digit1 - digit2 - digit3;
        return diff;
    }
    
    /**
     * This method displays all of the possible questions
     * @param digit1 ~ The first digit
     * @param digit2 ~ The second digit
     * @param digit3 ~ The third digit
     * @return pro ~ The product of d1, d2 and d3
     */
    public static double threeDigitProduct(double digit1, double digit2, double digit3) {
        //Scanner
        Scanner keyedInput = new Scanner(System.in);
        double pro;
        
        pro = digit1 * digit2 * digit3;
        return pro;
    }
    
    /**
     * This method displays all of the possible questions
     * @param digit1 ~ The first digit
     * @param digit2 ~ The second digit
     * @param digit3 ~ The third digit
     * @return quo ~ The quotient of d1, d2 and d3
     */
    public static double threeDigitQuotient(double digit1, double digit2, double digit3) {
        //Scanner
        Scanner keyedInput = new Scanner(System.in);
        double quo;
        
        quo = digit1 / digit2 / digit3;
        return quo;
    }
    
    /**
     * This method displays all of the possible questions
     * @param digit1 ~ The first digit
     * @return res ~ The square of d1
     */
    public static double digitSquared(double digit1) {
        //Scanner
        Scanner keyedInput = new Scanner(System.in);
        double res;
        
        res = digit1 * digit1;
        return res;
    }
    
    /**
     * This method displays all of the possible questions
     * @param digit1 ~ The first digit
     * @return res ~ The cube of d1
     */
    public static double digitCubed(double digit1) {
        //Scanner
        Scanner keyedInput = new Scanner(System.in);
        double res;
        
        res = digit1 * digit1 * digit1;
        return res;
    }
    
    /////////////////////////////////////MAIN////////////////////////////////////////
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        //Scanner
        Scanner keyedInput = new Scanner(System.in);
        //LOOP
        boolean runStill = true;
        while (runStill==true) {
            //Introduction
            introLaunch();
            //create the doubles
            double digit1, digit2, digit3;

            //Pick an Option
            int choicePick = keyedInput.nextInt();
            switch (choicePick) {
                
                case 1: //2 Addition
                    System.out.println("\t\tPlease select 2 Digits");
                    digit1 = keyedInput.nextDouble();
                    digit2 = keyedInput.nextDouble();
                    System.out.println("The Sum of "+digit1+" and "+digit2+" is: "+twoDigitAdd(digit1, digit2)+"\n");
                    break;
                case 2: //2 Subtraction
                    System.out.println("\t\tPlease select 2 Digits");
                    digit1 = keyedInput.nextDouble();
                    digit2 = keyedInput.nextDouble();
                    System.out.println("The Differnce of "+digit1+" and "+digit2+" is: "+twoDigitMinus(digit1, digit2)+"\n");
                    break;
                case 3: //2 Multiplication
                    System.out.println("\t\tPlease select 2 Digits");
                    digit1 = keyedInput.nextDouble();
                    digit2 = keyedInput.nextDouble();
                    System.out.println("The Product of "+digit1+" and "+digit2+" is: "+twoDigitProduct(digit1, digit2)+"\n");
                    break;
                case 4: //2 Division
                    System.out.println("\t\tPlease select 2 Digits");
                    digit1 = keyedInput.nextDouble();
                    digit2 = keyedInput.nextDouble();
                    System.out.println("The Quotient of "+digit1+" and "+digit2+" is: "+twoDigitQuotient(digit1, digit2)+"\n");
                    break;
                case 5: //3 Addition
                    System.out.println("\t\tPlease select 3 Digits");
                    digit1 = keyedInput.nextDouble();
                    digit2 = keyedInput.nextDouble();
                    digit3 = keyedInput.nextDouble();
                    System.out.println("The Sum of "+digit1+","+digit2+" and "+digit3+" is: "+threeDigitAdd(digit1, digit2, digit3)+"\n");
                case 6: //3 Subtract 
                    System.out.println("\t\tPlease select 3 Digits");
                    digit1 = keyedInput.nextDouble();
                    digit2 = keyedInput.nextDouble();
                    digit3 = keyedInput.nextDouble();
                    System.out.println("The Difference of "+digit1+","+digit2+" and "+digit3+" is: "+threeDigitMinus(digit1, digit2, digit3)+"\n");
                case 7: //3 Multiplication
                    System.out.println("\t\tPlease select 3 Digits");
                    digit1 = keyedInput.nextDouble();
                    digit2 = keyedInput.nextDouble();
                    digit3 = keyedInput.nextDouble();
                    System.out.println("The Product of "+digit1+","+digit2+" and "+digit3+" is: "+threeDigitProduct(digit1, digit2, digit3)+"\n");
                case 8: //3 Division
                    System.out.println("\t\tPlease select 3 Digits");
                    digit1 = keyedInput.nextDouble();
                    digit2 = keyedInput.nextDouble();
                    digit3 = keyedInput.nextDouble();
                    System.out.println("The Product of "+digit1+","+digit2+" and "+digit3+" is: "+threeDigitQuotient(digit1, digit2, digit3)+"\n");
                case 9: //Squared
                    System.out.println("\t\tPlease select a Digit");
                    digit1 = keyedInput.nextDouble();
                    System.out.println("The Square of "+digit1+" is: "+digitSquared(digit1)+"\n");
                case 10: //Cubed
                    System.out.println("\t\tPlease select a Digit");
                    digit1 = keyedInput.nextDouble();
                    System.out.println("The Cube of "+digit1+" is: "+digitCubed(digit1)+"\n");
                    
            }
            
            
        }
        
        
        
        
    }
    
}
