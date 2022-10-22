package RECURSION;

public class NumbersFrom {

public static void printNumbers(int s, int e){
    if (s>e) {
        return;
    }
    System.out.println(s);
    printNumbers(s+1, e);
}

    public static void main(String[] args) {
        int start = 1;
        int end = 5;
        printNumbers(start, end);
    }
}
