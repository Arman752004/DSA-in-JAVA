package javaBasicPrograms.Volume;

import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the Cylinder: ");
        double r = sc.nextDouble();
        System.out.println("Enter the height of the Cylinder:");
        double h = sc.nextDouble();
        double v = Math.PI * r * r * h ;
        System.out.println("Volume of the Cylinder is: " + v);
    }
}
