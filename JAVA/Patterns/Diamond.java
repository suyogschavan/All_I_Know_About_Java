package Patterns;

public class Diamond {
    public static void main(String[] args) {
        int n = 5;
        // First half Diamond
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            for (int j = 2; j <=i; j++) {
                System.out.print("*");
            }
        System.out.println();
        }
        // Second half Diamond
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
