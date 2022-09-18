// Take an array of Strings input from the user & find the cumulative (Combined) length of all those strings.

package StringBuilder.Excercise;

import java.util.Scanner;

public class CombinedLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array");
        int len = sc.nextInt();
        String ex[] = new String[len];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < ex.length; i++) {
            ex[i] = sc.next();
        }
        // System.out.println(ex[1]);

        // Here the Code begins
        int finalLength = 0;
        for (int i = 0; i < ex.length; i++) {
            finalLength = finalLength + ex[i].length();
        }
        System.out.println(finalLength);


    }
}
