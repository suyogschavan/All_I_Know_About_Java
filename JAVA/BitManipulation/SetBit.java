package BitManipulation;

/* Set the 2nd bit (position =1) of a number n. (n=0101) i.e. 5 */
public class SetBit {
    public static void main(String[] args) {
        int n = 5; // 0101
        int pos = 1;
        int bitMask = 1 << pos; // First Operation

        int newNumber = bitMask | n; // Second (OR) Operation
        System.out.println(newNumber); // newNumber = 7 = 0111
    }
}
