/**
 * Lab Assignment 4
@author Joseph Charland
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class LabAssign4_Charland {
    public static void main(String[] args) {
        Scanner scan = null;
        File f = new File("phonenumbers.txt");
        //holds phone number "part"
        int dig1;
        //counts the number of 3 part phone numbers
        int frequency = 0;
        int count;
        String[] token;
        String line;
        String phoneNumber = null;
        
        //try to read in file, if file is not valid catch error. 
        try{
            scan = new Scanner(f);
        }
        catch(FileNotFoundException e){
            System.out.println("Error Reading Text File");
            System.exit(0);
            
        }
        //while another line exists, move through line by line splitting lines by '-' and placing them into array. 
        while(scan.hasNext()){
            line = scan.nextLine();
            token = line.split("-");
            //validates that the first token is of length 3, second is of length 3, third is of length 4. 
            if ((token.length == 3) && (token[0].length() == 3) && (token[1].length() == 3) 
               && (token[2].length() == 4)){
                count = 0;
                //for all strings in token, go through one by one and try to convert to int. Also if able to parse to int, grab all items and place them in a newly created string, with "-" as joiner. If unable, catch numberformatexception and print statement. after 3 valid parts, count as one number and display the count at the end. 
                for (String s : token) {
                    try{
                        dig1 = Integer.parseInt(s);
                        phoneNumber = String.join("-",token);
                        count++;
                        //counts to make sure there are 3 valid "parts" to a number
                        if (count == 3){
                            frequency++;
                        }
                    }
                    catch(NumberFormatException ee){
                        System.out.println("Some or all data in this number are not ints: " + line);
                    }
                }
                System.out.println(phoneNumber);
            }else{
                System.out.println("Invalid Number Format: " + line);
            }    
        }
        System.out.println(frequency + " of the phone numbers are valid");
        scan.close();
        System.exit(0);
        
        }
        
        
}
   
