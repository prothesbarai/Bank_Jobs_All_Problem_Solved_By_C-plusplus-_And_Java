package JavaArrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JAVATWODArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Input Rows : ");
            int rows = scanner.nextInt();
            System.out.print("\nInput Cols : ");
            int cols = scanner.nextInt();

            int[][] myArray = new int[rows][cols];
            
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    myArray[i][j] = scanner.nextInt();
                    System.out.print(myArray[i][j]+" ");
                }
                System.out.println();
            }
            
            
            
            System.out.println("\n\n");
            
            
            int sum = 0;
            int max = myArray[0][0];
            int min = myArray[0][0];
            
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if(max < myArray[i][j]){
                        max = myArray[i][j];
                    }
                    if(min > myArray[i][j]){
                        min = myArray[i][j];
                    }
                    sum += myArray[i][j];
                }
            }
            
            System.out.println("Max = "+max);
            System.out.println("Min = "+min);
            System.out.println("Sum = "+sum);
            int avg = sum/myArray.length;
            System.out.println("Avg = "+avg);
            
            
            // Diagonal Addition 
            int diagonalSum = 0;
            int upperTriangle = 0;
            int lowerTriangle = 0;
            
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    
                    if(i==j){
                       diagonalSum += myArray[i][j];
                    }
                    
                    if(i<j){
                        upperTriangle += myArray[i][j];
                    }
                    
                    if(i>j){
                        lowerTriangle += myArray[i][j];
                    }
                    
                }
            }
            
            System.out.println("Diagonal Sum = "+diagonalSum);
            System.out.println("Upper Triangle Sum = "+upperTriangle);
            System.out.println("Lower Triangle Sum = "+lowerTriangle);
            
            
        }catch(InputMismatchException e){
            System.out.println(e);
        }

    }
}
