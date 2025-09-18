package javaBasicPrograms.Area;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of side:");
        double s = sc.nextDouble();
        double a = s * s;
        System.out.println("Area of the square is:" + a);
    }
}
