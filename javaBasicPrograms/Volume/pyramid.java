package javaBasicPrograms.Volume;

import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the baseArea of the pramid: ");
        double baseArea = sc.nextDouble();
        System.out.println("Enter the height of the pramid: ");
        double h = sc.nextDouble();
        double v = (baseArea * h) / 3;
        System.out.println("volume of the pyramid is: " + v);
    }
}
