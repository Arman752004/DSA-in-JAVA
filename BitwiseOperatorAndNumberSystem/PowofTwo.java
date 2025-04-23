//if the binary number is divisible by 2
package BitwiseOperatorAndNumberSystem;

public class PowofTwo {
    public static void main(String[] args) {
        int n = 16;  //note:fix for n = 0;
        boolean ans =  n > 0 && (n & (n-1)) == 0;       
        //if both n and n-1 comes 0 then the ans is true
        System.out.println(ans);
    }
}