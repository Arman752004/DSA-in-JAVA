package javaBasicPrograms.Area;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of the Rectangle: ");
        double b = sc.nextDouble();
        System.out.println("Enter the length of the Rectangle: ");
        double l = sc.nextDouble();
        double a = b * l;
        System.out.println("Area of the Rectangle is: " + a);
    }
}
