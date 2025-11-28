package Functions.practice;

import java.util.Scanner;

public class Prime {
    public static boolean isPrime(int n){
        if (n<=0) return false;
        for(int i = 2;i*i <= n;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(isPrime(n) ? "It is a Prime Number." : "It is not a Prime Number.");
    }
}
