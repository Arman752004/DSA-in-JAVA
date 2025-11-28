package Functions.practice;

import java.util.Scanner;

public class EvenOdd {
    public static void EvenOdd(int n){
        if(n % 2 == 0){
            System.out.println("It is an even number.");
        }else{
            System.out.println("It is an odd Number.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        EvenOdd(n);
    }
}
