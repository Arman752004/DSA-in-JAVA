package javaBasicPrograms.Area;

import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.println("Enter the side of the EquilateralTriangle: ");
        double s = sc.nextDouble();
        double a = (Math.sqrt(3) / 4) * s * s;
        System.out.println("Area of the Equilatral Triangle is: " + a);
    }
}
