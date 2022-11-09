package RECURSION;

public class FactorialR {
    public static int factorialOfNum(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact_nm1 = factorialOfNum(n - 1);
        int fact_n = n * fact_nm1;
        return fact_n;

    }

    public static void main(String[] args) {
        int factOf = 5;
        System.out.println(factorialOfNum(factOf));
    }
}
