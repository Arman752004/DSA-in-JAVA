package javaBasicPrograms.Perimeter;
import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side: ");
        double s = sc.nextDouble();
        double p = 4 * s;
        System.out.println("Perimeter of the Rhombus is: " + p);
    }
}
