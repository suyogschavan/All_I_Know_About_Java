package Week1;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of A: ");
        int a=sc.nextInt();
        System.out.println("Enter value of B: ");
        int b=sc.nextInt();
        System.out.println("What do you wan't to do? type between(+,-,*,/");
        String key=sc.next();
        switch (key) {
            case "+":
                System.out.println("Addition : "+(a+b));
                break;
            case "-":
                System.out.println("Substraction : "+(a-b));
                break;
            case "*":
                System.out.println("Multiplication : "+(a*b));
                break;
            case "/":
                System.out.println("Division : "+(a/b));
                break;
        
            default:
                break;
        }
    }
}
