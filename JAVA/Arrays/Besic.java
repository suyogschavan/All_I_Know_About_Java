package Arrays;

public class Besic {
    public static void main(String[] args) {
        // Defining Array's for the first time
        int[] marks = new int[3]; // Method 1
        // int marks[] = new int[3]; // Method 2 
        // int marks[] = {94, 95, 93}; // Method 3 (All are valid)
        marks[0] = 94;
        marks[1] = 95;
        marks[2] = 93;

        // Element can't be printed like this
        System.out.println("Marks: " + marks);// Like this we can't print array

        // To print the array we have to give the position we wan't to print
        System.out.println(marks[0]); // Here we are printing the value at 0th possition in array
        System.out.println(marks[1]); // Here we are printing the value at 1st possition in array
        System.out.println(marks[2]); // Here we are printing the value at 2nd possition in array

        // Same as above but from loop
        for (int i = 0; i < marks.length; i++) {
            System.out.println("From Loop " + marks[i]);
        }

    }
}
