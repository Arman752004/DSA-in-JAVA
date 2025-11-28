package Functions.practice;

import java.util.Scanner;

public class Factorial {
    public static long isFact(int n){
        long fact = 1;
        for (int i = 0; i <= n; i++) {
            fact *= i;
        }
        return fact;  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        System.out.println("Factorial = " + isFact(n));
    }
}
