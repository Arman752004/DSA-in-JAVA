package javaBasicPrograms.Area;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of the Triangle: ");
        double b = sc.nextDouble(); 
        System.out.println("Enter the height of the Triangle: ");
        double h = sc.nextDouble(); 
        double a = 0.5 * b * h;
        System.out.println("Area of the triangle is: " + a);
    }
}
