package Functions.practice;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int n){
        int original = n;
        int rev = 0;
        while(n > 0){
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev == original;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println(isPalindrome(n) ? "It is a Palindrome Number." : "It is not a Palindrome Number.");
    }
}
