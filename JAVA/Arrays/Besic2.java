package Arrays;

import java.util.Scanner;

public class Besic2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array");
        int size=sc.nextInt();
        int numbers[] = new int[size];
 
        // For input
        for (int i = 1; i < numbers.length; i++) {
            System.out.println("Enter the number at "+i+" possition ");
            numbers[i]=sc.nextInt();
        }

        // For output
        System.out.println("Your Array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
