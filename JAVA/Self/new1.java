package Self;

import java.util.Scanner;

public class new1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A=sc.next();

        StringBuilder Sa = new StringBuilder(A);
        StringBuilder S = new StringBuilder();

        for (int i = Sa.length() - 1; i >= 0; i--) {
            S.append(Sa.charAt(i));
        }
        if (Sa == S) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
