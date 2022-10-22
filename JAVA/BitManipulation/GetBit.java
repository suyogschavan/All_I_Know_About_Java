package BitManipulation;

/* get the 3rd bit (position =2) of a number n. (n=0101) i.e. 5 */


public class GetBit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;// First Operation

        if((bitMask & n )==0){ // Second Operation
            System.out.println("Bit was Zero");
        }else{
            System.out.println("Bit was One");
        }
    }
}
