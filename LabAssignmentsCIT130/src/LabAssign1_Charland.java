/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
@author Joe
 */
import java.util.Scanner;

public class LabAssign1_Charland {
    public static void main(String[] args) {
        int userNum1;
        int userNum2;
        int operationChoice;
        int calculation;
        System.out.print("Enter first integer --> ");
        userNum1 = askForInt();
        System.out.print("Enter second integer --> ");
        userNum2 = askForInt();
        do {
            operationChoice = askForOperation();
            
        }while (operationChoice <= 0 || operationChoice >= 6 );{
            switch (operationChoice){
                //addition
                case 1: System.out.println("The sum is " + additionOperation(userNum1, userNum2));
                break;
                //subtraction
                case 2: System.out.println("The difference is " + subtractionOperation(userNum1, userNum2));
                break;
                //multiplication
                case 3: System.out.println("The product is " + multiplicationOperation(userNum1, userNum2));
                break;
                //divison
                case 4:
                    if (userNum2 == 0){
                        System.out.println("Division by 0 is not allowed");
                        break;
                    }else{
                        System.out.println("The quotient is " + divisionOperation(userNum1, userNum2));
                        break;
                    }
                //modulus
                case 5: 
                    if (userNum2 == 0){
                        System.out.println("Remainder division by zero is not allowed");
                        break;
                    }else{
                        System.out.println("The remainder is " + modulusOperation(userNum1, userNum2));
                        break;
                    }
                //default
                default: 
                break;
            }
        }
    }
        
//int method 
    
public static int askForInt () {
    Scanner intInput = new Scanner(System.in);
    return intInput.nextInt();
    }
//choice method
public static int askForOperation () {
    Scanner operation = new Scanner(System.in);
    System.out.println("Enter operation of choice");
    System.out.println("1 - addition");
    System.out.println("2 - subtraction");
    System.out.println("3 - multiplication");
    System.out.println("4 - division");
    System.out.println("5 - modulus");
    System.out.print("Choice : --> ");
    return operation.nextInt();
    }
//addition method
public static int additionOperation(int a, int b) {
    int addSum = a + b;
    return addSum;
    }
//subtraction method
public static int subtractionOperation(int a, int b) {
    int subSum = a - b;
    return subSum;
    }
//multiplication method
public static int multiplicationOperation(int a, int b) {
    int multiSum = a * b;
    return multiSum;
    }
//division method
public static float divisionOperation(int a, int b) {
    float quotient = (float) a / (float) b;
    return quotient;
    }
//modulus method
public static int modulusOperation(int a, int b) {
    int remainder = a % b;
    return remainder;    
    }

}
