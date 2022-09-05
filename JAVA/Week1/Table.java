package Week1;
import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Table of Number "+n+" :");
        for(int i=1; i<=10; i++){
            System.out.println(n*i);
        }
    }
}
