package TwoDArrays;

import java.util.Scanner;

public class Besic1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = sc.nextInt();

        // Declearing 2D array.
        int[][] numbers = new int[rows][cols];

        // Getting Elements from input
        System.out.println("Enter the elements");
        // for rows
        for (int i = 0; i < rows; i++) {
            // for Columns
            for (int j = 0; j < cols; j++) {
                numbers[i][j]=sc.nextInt();
            }
        }

        // Output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

    }
}
