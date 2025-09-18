package javaBasicPrograms.Volume;

import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere:");
        double r = sc.nextDouble();
        double v = (4.0/3.0) * Math.PI * r * r * r;
        System.out.println("The volume of the sphere is: " + v);
    }
}
