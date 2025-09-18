package javaBasicPrograms.SurfaceArea;
//Total Surface Area
import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the side: ");
        double s = sc.nextDouble();
        double tsa = 6 * s * s;         //tsa=Total Surface Area
        System.out.println("TSA of the Cube is: " + tsa);
    }
}
