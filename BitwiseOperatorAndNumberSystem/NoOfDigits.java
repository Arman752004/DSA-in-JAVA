package BitwiseOperatorAndNumberSystem;
//No. of digits in binary,octal,decimal and hexadecimal.
public class NoOfDigits {
    public static void main(String[] args) {
        int n = 34567;
        int b = 10;

        int ans  = (int)(Math.log(n) / Math.log(b)) + 1;  //to take base we can divide the same log with b
        System.out.println(ans);
    }
}
