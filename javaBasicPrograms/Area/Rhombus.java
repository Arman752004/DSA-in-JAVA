package javaBasicPrograms.Area;

import java.util.Scanner;

public class Rhombus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter diagonal1: ");
        double d1 = sc.nextDouble();
        System.out.println("Enter diagonal2: ");
        double d2 = sc.nextDouble();
        double a = (d1 * d2) / 2;       //area = (diagonal1 * diagonal2) / 2
        System.out.println("Area of the Rhombus: " + a);
    }
}