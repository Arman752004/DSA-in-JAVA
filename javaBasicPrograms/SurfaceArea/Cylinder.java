package javaBasicPrograms.SurfaceArea;
//Curved surface area of the cylinder

import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        double r = sc.nextDouble();
        System.out.println("Enter height: ");
        double h = sc.nextDouble();
        double csa = 2 * Math.PI * r * h;       //csa=curved surface area
        System.out.println("CSA of the Cylinder is:" + csa);
    }
}
