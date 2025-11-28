package Functions.practice;

import java.util.Scanner;

public class AreaAndCircumferenceOfCircle {
    public static double Area(int r){
        return 3.14 * r * r;
    }
    public static double Circumference(int r){
        return 2 * 3.14 * r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        int r = sc.nextInt();
        System.out.println("Area = " + Area(r));
        System.out.println("Circumference = " + Circumference(r));
    }
}
