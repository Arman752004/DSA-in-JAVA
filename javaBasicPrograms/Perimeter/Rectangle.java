package javaBasicPrograms.Perimeter;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");  
        double l = sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle: ");  
        double b = sc.nextDouble();
        double p = 2 * (l + b);
        System.out.println("Perimeter of the Rectangle is: " + p);
    }
}
