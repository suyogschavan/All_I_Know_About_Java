package Functions;

import java.util.Scanner;

public class Table {
    public static void tableOf(int a) {
        for (int i = 1; i <= 10; i++) {
            System.out.println((i*a));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print it's table");
        int n = sc.nextInt();
        tableOf(n);
    }
}
