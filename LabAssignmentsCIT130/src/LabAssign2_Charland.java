/**
@author Joe Charland
 */
import java.util.Scanner;

public class LabAssign2_Charland {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userNum1;
        int userNum2;
        char operationChoice;
        userNum1 = getOperand(input, "First");
        userNum2 = getOperand(input , "Second");
        do {
            operationChoice = askForOperation();
            
        }while ((operationChoice != '+') && (operationChoice != '-') && (operationChoice != '*') && (operationChoice != '/') && (operationChoice != '%'));{
            switch (operationChoice){
                //addition
                case '+': 
                    System.out.println("The sum is " + additionOperation(userNum1, userNum2));
                    break;
                //subtraction
                case '-': 
                    System.out.println("The difference is " + subtractionOperation(userNum1, userNum2));
                    break;
                //multiplication
                case '*': 
                    System.out.println("The product is " + multiplicationOperation(userNum1, userNum2));
                    break;
                //divison
                case '/':
                    if (userNum2 == 0){
                        System.out.println("Division by 0 is not allowed");
                        break;
                    }else{
                        System.out.println("The quotient is " + divisionOperation(userNum1, userNum2));
                        break;
                    }
                //modulus
                case '%': 
                    if (userNum2 == 0){
                        System.out.println("Remainder division by zero is not allowed");
                        break;
                    }else{
                        System.out.println("The remainder is " + modulusOperation(userNum1, userNum2));
                        break;
                    }
                //default
                default: 
                    System.out.println("Error");
                    break;
            }
        }
    }
        
    
    
public static int getOperand (Scanner scan, String wordNumber) {
    System.out.print("Enter the " + wordNumber + " integer --> ");
    return scan.nextInt();
    }
//choice method
public static char askForOperation () { 
    Scanner operation = new Scanner(System.in);
    System.out.println("Enter operation of choice");
    System.out.println("+ - addition");
    System.out.println("- - subtraction");
    System.out.println("* - multiplication");
    System.out.println("/ - division");
    System.out.println("% - modulus");
    System.out.print("Choice : --> ");
    char selection = operation.next().charAt(0);
    return selection;
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
