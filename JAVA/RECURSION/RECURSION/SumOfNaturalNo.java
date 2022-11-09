package RECURSION;

public class SumOfNaturalNo {

    public static void printSum(int n, int i, int sum) {
        if (i != n) {
            sum += i;
            printSum(n, i + 1, sum);
            return;
        }
        System.out.println("Sum = "+sum);;
    }

    public static void main(String[] args) {
        int n = 3;
        int i = 1;
        int sum = 0;
        printSum(n,i, sum);
    }
}
