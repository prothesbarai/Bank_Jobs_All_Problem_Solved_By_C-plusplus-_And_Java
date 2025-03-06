package JavaArrays;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JARRAY {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            int arrayLength = scanner.nextInt();
            int[] myArray = new int[arrayLength];
            
            

            //Get Input From User 
            for (int i = 0; i < arrayLength; i++) {
                myArray[i] = scanner.nextInt();
            }
            
            scanner.close();

            // Array Sorting
            Arrays.sort(myArray);
           
            
            System.out.println("Output==================/n/n");
            for (int i = 0; i < myArray.length ; i++) {
                System.out.print(myArray[i] + " ");
            }
            int sum =0;
            for (int i = 0; i < myArray.length; i++) {
                sum += myArray[i];
            }
            System.out.print("\nSum==== "+sum+"\n");
            float avg = sum/myArray.length;
            System.out.print("\nAvg========"+avg);
            
            
            // max Number and minimum number find here 
            int max = myArray[0];
            int min = myArray[0];
            
            for (int i = 0; i < myArray.length; i++) {
                if (max<myArray[i]) {
                    max = myArray[i];
                }
                if(min > myArray[i]){
                    min = myArray[i];
                }
            }
            
            System.out.println("\nMax = "+max);
            System.out.println("\nMin = "+min);
            
            
            
                
       
            

        } catch (InputMismatchException e) {
            System.out.println(e);
        }

    }
}
