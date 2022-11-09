package RECURSION;

public class fibonacci {
    public static void fiboOf(int a, int b, int n){
        if (n==0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        fiboOf(a=b, b=c, n-1);
    }
    public static void main(String[] args) {
        int a = 0, b = 1, n = 7;
        System.out.println(a);
        System.out.println(b);
        fiboOf(a, b, n-2);
    }
}
