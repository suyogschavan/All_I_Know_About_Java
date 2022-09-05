package Functions;

import java.util.Scanner;

public class EvenOdd {
    public static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you wan't to check ");
        int n = sc.nextInt();
        if (isEven(n)) {
            System.out.println("Yes it is EVEN");
        } else {
            System.out.println("This is ODD");
        }
    }
}
