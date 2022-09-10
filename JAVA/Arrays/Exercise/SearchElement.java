package Arrays.Exercise;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length");
        int length = sc.nextInt();

        // Creation of array
        int arr[] = new int[length];
        System.out.println("Enter the elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Find the index of element
        System.out.println("Enter the number you wan't to find ");
        int find = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find) {
                System.out.println("Element is on the index " + i);
            } else {
                if (arr[i] == (arr.length - 1)) {
                    System.out.println("There is no such Element Exists in this Array.");
                }
            }
        }
    }
}
