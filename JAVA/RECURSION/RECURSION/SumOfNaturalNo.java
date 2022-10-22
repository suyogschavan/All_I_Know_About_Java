package RECURSION;

public class SumOfNaturalNo {

    public static int printSum(int n, int i, int sum) {
        if (i != n) {
            sum = sum + i;
            printSum(n, i + 1, sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(printSum(n, 1, 0));
    }
}
