package StringBuilder.Excercise;

import java.util.Scanner;

public class UsernameCreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Email: ");
        String email = sc.next();
        String uname = "";

        int i = 0;
        while (email.charAt(i) != '@') {
            uname += email.charAt(i);
            i++;
        }

        System.out.println(uname);

    }
}
