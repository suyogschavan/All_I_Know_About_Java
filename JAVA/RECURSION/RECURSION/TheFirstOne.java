package RECURSION;

/**
 * TheFirstOne
 */
public class TheFirstOne {


    public static void printNum(int n){
        
        if (n==0) { /** base condition */
        return;
        }
        System.out.println(n); // printing statement
        printNum(n-1);   // the real game ( recursion )
    }

    public static void main(String[] args) {
        int n = 10;
        printNum(n);
    }
}