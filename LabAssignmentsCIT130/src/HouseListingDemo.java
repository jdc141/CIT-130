//Joseph Charland Exam 2
// Regarding above error - Either leave package blank OR ensure BOTH files belong to the same package

import java.util.Scanner;


/**
 * This program will use the HouseListing class and display a list of
 * houses sorted by the house's listing number
 * 
 * Complete the code below the numbered comments, 1 - 4. DO NOT CHANGE the
 * pre-written code
 * Joseph Charland Exam 2
 * @author 
 *
 */

public class HouseListingDemo {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        HouseListing[] list;
        String listNumber, listDesc;
        int count = 0;
        double listPrice;
        String output;
        
        double mostExpensive;
        
         do{
            System.out.print("Enter the number of houses --> ");
           count = scan.nextInt();
        }while(count < 1);
        /* 1.
         * create an array of HouseListing objects using the variable that holds
         * the user's response to the prompt above
         */
        {
            list = new HouseListing[count];
        }
        
        
        
        // for loop loads the array with HouseListing's constructor
        for (int i = 0; i < list.length; i++) 
        {
           System.out.println("\n***HOUSE " + (i+1) + "***");
           // Prompt for house listing #
           System.out.print("Enter house listing " +
                   "number (Alphanumeric) #"+ (i+1) +": ");
           listNumber = scan.next();
           
           // Clear buffer
           scan.nextLine();
           
           // Prompt for house description
           System.out.print("Enter description for " +
                   "house #" +(i+1) + ": ");
           listDesc = scan.nextLine();
           
           // Prompt for house price
           System.out.print("Enter listing price for " 
                   + "house #" +(i+1) + ": ");
           listPrice = scan.nextDouble();
           
            /* 2.
             * create a HouseListing object using the input values and store/load
             * the object in the array
             */
            list[i] = new HouseListing(listNumber, listDesc, listPrice);
        }
            
        /* 3.
         * Assign the 0th element of the array to the most expensive house
           think ... you can't assign an object to a price but the object
           has a method that may help you here ... 
        
           ***If you decide to complete this step a different way (or perhaps not at all?)
           Please write a comment explaining how / why.***
         */
        
        mostExpensive = list[0].getListPrice();
        
        output = "Listings:\n";
        /*
         * loop below builds the output string
         */
        for (int i = 0; i < list.length; i++) {
            output += list[i] + "\n";
            
            /* 4.
              Using a control structure, find and the store the double varaible
              which holds the most expensive house (We don't need to listing #)
              JUST THE PRICE
            */
            if (list[i].getListPrice() > mostExpensive)
            {
                mostExpensive = list[i].getListPrice();
            }
        }
        // output
         System.out.println(output);
        System.out.println("The most expensive house on the market costs: $" 
        + mostExpensive);
    }
}
