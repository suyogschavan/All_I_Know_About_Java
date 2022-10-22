package BitManipulation;
/* Clear the 3rd bit (position =2) of a number n. (n = 0101) i.e. 5 */
public class ClearBit {
    public static void main(String[] args) {
       int n = 5; // 0101
       int pos = 2;
       int bitMask = 1<<pos; // First Operation
       int notBitMask = ~(bitMask); // Second NOT Operation

       int newNumber = notBitMask & n; // Third AND Operation
       System.out.println(newNumber); // op 1 i.e. 0001
    }
}
