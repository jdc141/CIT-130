
import java.util.Arrays;
import java.util.Scanner;

/**
@author Joseph Charland
* Exam 1 | Question 3
* 10/2/2021
 */
public class Exam1_Charland3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] numArray = loadArray(scan);
        int evenCount = countEven(numArray);
        double[] evenArray = getEvenArray(numArray, evenCount);
        //display output
        System.out.println("The array contains: " + Arrays.toString(numArray));
        System.out.println(evenCount + " of these values are even numbers.");
        System.out.println("The even array contains: " + Arrays.toString(evenArray));
        
    }
    //method for user input. Calls an array of value 5, returns array with user input
    public static double[] loadArray(Scanner sc){
        double[] numArray;
        numArray = new double[5];
        //for loop, creates counter variable (i), loops through array. Adds user doubles to array. 
        for(int i = 0; i < numArray.length; i++){
            System.out.print("Enter a number (Whole or Decimal) to store in the array ");
            numArray[i] = sc.nextDouble();
        }
        return numArray;
    }
    public static int countEven(double[] a) {
        int evenCount = 0;
        //enhanced for loop
        for (double x: a){
            //to handle 0 not being an even number
            if(x % 2 == 0 && x != 0){
                evenCount++;
            }
        }
        return evenCount;
    }
    public static double[] getEvenArray(double[] arr, int eCount){
        double[] evenArray;
        evenArray = new double[eCount];
        int evenPos = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] % 2 == 0){
                evenArray[evenPos] = arr[i];
                evenPos++;
            }
        }
        return evenArray;
    }
    
}
