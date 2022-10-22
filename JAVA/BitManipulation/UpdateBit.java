package BitManipulation;

import java.util.Scanner;

/* Update the 2nd bit (position =1) of a number n to 1. (n=0101) */
public class UpdateBit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int oper = sc.nextInt(); // oper = 1: SET; oper = 2: CLEAR;
    int n = 5;
    int pos = 1;
    int BitMask = 1 << pos;

    if (oper == 1) {
      // SET
      int newNumber = BitMask | n;
      System.out.println(newNumber);
    } else {
      // CLEAR
      int notBitMask = ~BitMask;
      int newNumber = notBitMask & n;
      System.out.println(newNumber);
    }

  }
}
