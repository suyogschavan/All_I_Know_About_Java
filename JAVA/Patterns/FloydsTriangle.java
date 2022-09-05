package Patterns;

public class FloydsTriangle {
    public static void main(String[] args) {
        int number=1;
        int n=5;
        for (int i = 0; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}
