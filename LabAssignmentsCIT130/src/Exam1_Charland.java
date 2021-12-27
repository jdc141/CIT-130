
import java.util.Arrays;
import java.util.Scanner;

/**
@author Joseph Charland
* Exam 1 | Question 1
* 10/2/2021
 */
public class Exam1_Charland {
    public static void main(String[] args) {
                  
        //call method
        double[] doubleArray = userInputArrMethod();
        int evenInArray = evenLoop(doubleArray);
        //display output
        System.out.println("The array contains: " + Arrays.toString(doubleArray));
        System.out.println(evenInArray + " of these values are even numbers.");
        
    }
    //method for user input. Calls an array of value 5, returns array with user input
    public static double[] userInputArrMethod(){
        Scanner scan = new Scanner(System.in);
        double[] numArray;
        numArray = new double[5];
        //for loop, creates counter variable (i), loops through array. Adds user doubles to array. 
        for(int i = 0; i < numArray.length; i++){
            System.out.print("Enter a number (Whole or Decimal) to store in the array ");
            numArray[i] = scan.nextDouble();
        }
        return numArray;
    }
    public static int evenLoop(double[] arr) {
        int evenCount = 0;
        //enhanced for loop
        for (double x: arr){
            //to handle 0 not being a even number
            if(x == 0){
                continue;
            }
            else if(x % 2 == 0){
                evenCount++;
            }
        }
        return evenCount;
    }
}
