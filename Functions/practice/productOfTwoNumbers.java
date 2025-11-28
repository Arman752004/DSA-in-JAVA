package Functions.practice;

import java.util.Scanner;

public class productOfTwoNumbers {
    public static int sum(int a,int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        System.out.println("Product of two numbers is: " + sum(a, b));
    }
}