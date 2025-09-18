package javaBasicPrograms.Area;

import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of the Parallelogram:");
        double b = sc.nextDouble();
        System.out.println("Enter the height of the Parallelogram:");
        double h = sc.nextDouble();
        double a = b * h;
        System.out.println("The area of the parallelogram is:" + a);
    }
}
