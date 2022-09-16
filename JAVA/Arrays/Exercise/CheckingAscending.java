package Arrays.Exercise;

import java.util.Scanner;

public class CheckingAscending {
    public static boolean isAscending(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int size = sc.nextInt();

        int nArray[] = new int[size];

        // Creating user defiened array
        System.out.println("Enter the elements in array.");
        for (int i = 0; i < size; i++) {
            nArray[i] = sc.nextInt();
        }

        // Checking wether array is in ascending order or not.
        if (isAscending(nArray)) {
            System.out.println("Array is in ascending order.");
        } else {
            System.out.println("Not in ascending order");
        }

    }
}
