package Patterns;

public class EmptyRectangle {
    public static void main(String[] args) {
        int r = 7;
        int c = 8;
        // outerloop
        for (int i = 1; i <= r; i++) {
            // Innerloop
            for (int j = 1; j <= c; j++) {
                if (i == 1 || j == 1 || i == r || j == c) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
