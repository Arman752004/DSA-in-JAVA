package javaBasicPrograms.Volume;

import java.util.Scanner;

public class Cone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the Cone: ");
        double r = sc.nextDouble();
        System.out.println("Enter the height of the Cone:");
        double h = sc.nextDouble();
        double v = (Math.PI * r * r * h) / 3;
        System.out.println("Volume of the Cone is: " + v);
    }
}
