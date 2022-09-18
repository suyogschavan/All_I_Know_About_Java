package StringBuilder;
import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name: ");
        StringBuilder s = new StringBuilder(sc.next());
        StringBuilder s2 = new StringBuilder();
        for (int i = s.length()-1; i >=0; i--) {
            s2.append(s.charAt(i));
        }
        System.out.println(s2);
    }
}
