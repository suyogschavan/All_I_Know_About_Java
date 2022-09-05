package Patterns;

public class InvertedRightAngled {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                // Inner 1
                System.out.print(" ");
            }
            for(int j=1; j<= i; j++){
                // Inner 2
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
