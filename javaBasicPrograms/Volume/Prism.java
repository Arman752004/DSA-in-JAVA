package javaBasicPrograms.Volume;

import java.util.Scanner;

public class Prism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the BaseArea: ");
        double baseArea = sc.nextDouble();
        System.out.println("Enter the height of the Prism:");
        double h = sc.nextDouble();
        double v = baseArea * h;
        System.out.println("Volume of the Prism is: " + v);
    }
}
