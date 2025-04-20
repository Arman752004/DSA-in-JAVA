package Functions;

import java.util.Scanner;;
public class Methods {
    public static void main(String[] args) {
        //Q:Take input of two numbers and take the sum
        Scanner in = new Scanner(System.in);
        int num1,num2,sum;      //we defined it earlier
        System.out.println("Enter number 1:");
        num1 = in.nextInt();
        System.out.println("Enter number 2:");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("The sum: " + sum);
        in.close();
    }   
}
