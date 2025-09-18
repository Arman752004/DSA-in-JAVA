package javaBasicPrograms.Perimeter;

import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side:");
        double s = sc.nextDouble();
        double p = 3 * s;
        System.out.println("Perimeter of the Equilateral Triangle is:" + p);
    }
}
