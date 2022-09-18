// Input a string from user. Create a new string called 'result' in which you will replace the letter 'e' in the original string with letter i;

package StringBuilder.Excercise;

import java.util.Scanner;

public class ReplaceLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        String result = "";

        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == 'e') {
                result += 'i';
            } else {
                result += st.charAt(i);
            }
        }
        System.out.println(result);
    }
}
