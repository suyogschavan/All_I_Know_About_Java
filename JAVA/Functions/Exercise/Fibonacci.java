package Functions.Exercise;

import java.util.Scanner;

public class Fibonacci {
    public static void printFibonacci(int n){
        for (int i = 1; i <=n; i++) {
            
            int a = 0; 
            int b = 1;
            // int temp = 0;
            System.out.print(a+" "+b+" ");
            // temp = a;
            b=a+b;
            a=b;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        printFibonacci(s);
    }
}
