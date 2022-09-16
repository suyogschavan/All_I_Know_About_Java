package TwoDArrays.Excercise;
// Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs.

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of Colunms:");
        int colm = sc.nextInt();

        int arr[][]=new int[rows][colm];

        System.out.println("Enter the elements in the array");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colm; j++) {
                arr[i][j]=sc.nextInt();
            }
        }

        // Searching method

        System.out.println("Enter the element you wan't to search in this array.");
        int find=sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colm; j++) {
                if (arr[i][j]==find) {
                    System.out.println("It is present at index ("+i+", "+j+")");
                }            
            }
        }


    }
}
