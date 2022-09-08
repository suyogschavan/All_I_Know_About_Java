package Functions.Exercise;

import java.util.Scanner;

public class Average {
    public static void printAverage(int a, int b, int c){
        System.out.println("The Average of numbers is: "+(a+b+c)/3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers to calculate their Average");
        int z = sc.nextInt();
        int x = sc.nextInt();
        int c = sc.nextInt();
        
        // calling the function
        printAverage(z,x,c);


    }
    
}
