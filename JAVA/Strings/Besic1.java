package Strings;
import java.util.Scanner;
public class Besic1 {
    public static void main(String[] args) {
        // String Declaration
        String name = "Tony";
        String fullName = "Tony Stark";
        // String sentence = "My name is Tony Stark";

        // Taking input from user
        Scanner sc = new Scanner(System.in);
        //String iname = sc.next();// for only word
        String iname = sc.nextLine();// for whole line
        System.out.println("Your name is : "+iname);

        // Concatenation
        String fname="Suyog";
        String lname="Chavan";
        String fullname = fname+lname;
        System.out.println(fullname);

        // Get length
        System.out.println(fullname.length());

        // charAt
        for (int i = 0; i < fullname.length(); i++) {
            System.out.println(fullname.charAt(i));
        }
        

        //compare
        String name1="TONY";
        String name2="TONY";
        if(name1.compareTo(name2)==0){
            System.out.println("Strings are Equal");
        }else{
            if(name1.compareTo(name2)>0){
                System.out.println("String1 is greater than other one");
            }else{
                System.out.println("String1 is lesser than other one");
            }
        }
        
        // Substring
        String sentence = "Hi i am Suyog";
        String substring = sentence.substring(8, sentence.length());
        System.out.println(substring); // only suyog will be get printed.

        // Strings are Immutable

    }
}
