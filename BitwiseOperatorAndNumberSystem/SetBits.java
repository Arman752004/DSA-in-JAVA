package BitwiseOperatorAndNumberSystem;
//counting number of 1 in the binary representation of the number
public class SetBits {
    public static void main(String[] args) {
        int n = 10;

        System.out.println(Integer.toBinaryString(n)); //by this we can see binary of a number

        System.out.println(setBits(n));
    }
    private static int setBits(int n){
        int count = 0;

        // while (n > 0) {
        //     count++;
        //     n -= (n & -n);
        // }

            //or we can do this also
        
        while (n>0) {
            count++;
            n = n & (n-1);
        }

        return count;
    }
}
