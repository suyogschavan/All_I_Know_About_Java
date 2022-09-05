package Functions;

import java.util.Scanner;

public class PrimeNumber {


    static int i=2;

    public static boolean primeOrNot(int a) {
        if(a<=1){
            return false;
        }
        if (a==i){
            return true;
        }
        if(a % i == 0){
            return false;
        }
        i++;
        return primeOrNot(a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to check whether it is Prime or not.");
        int a=sc.nextInt();

        if(primeOrNot(a)){
            System.out.println("Yes it is a Prime Number.");
        }else{
            System.out.println("Nope it is not a Prime Number");
        }

    }
}
