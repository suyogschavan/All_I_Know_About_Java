package Functions;

import java.util.Scanner;

public class Simple1 {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name and we'll print it for you.");
        String n=sc.nextLine();
        printMyName(n);
    }
}
