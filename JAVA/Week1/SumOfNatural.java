package Week1;

import java.util.Scanner;

public class SumOfNatural {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int sum=0;
        for(int i=0; i<=n; i++){
            sum=sum+i;
        }
        System.out.println("Sum of first "+n+" Natural Numbers: "+sum);
    }
}
