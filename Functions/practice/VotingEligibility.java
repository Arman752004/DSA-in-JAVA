package Functions.practice;

import java.util.Scanner;

public class VotingEligibility {
    public static void checkEligibility(int age){
        if(age > 18){
            System.out.println("Can Vote");
        }else{
            System.out.println("Can't Vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the voter:");
        int age = sc.nextInt();
        checkEligibility(age);
    }
}
