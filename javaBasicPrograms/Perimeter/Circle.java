package javaBasicPrograms.Perimeter;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of radius:");
        double r = sc.nextDouble();
        double d = 2 * Math.PI * r;
        System.out.println("Diameter of the Circle is:" + d); 
    }
}
