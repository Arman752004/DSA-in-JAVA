
import java.util.Scanner;
public class inputs {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.print("Please enter some input:");
        // int rollno = input.nextInt();
        // System.out.println("your roll no. is " + rollno);

        // int a = 234_000_000;
        //  

        // String name = input.nextLine();
        // System.out.println(name);

                //sum
        // int num1 = input.nextInt();
        // int num2 = input.nextInt();

        // int sum = num1 + num2;
        // System.out.println("Sum:" + sum);

                //type casting
        // int num = (int)(67.56f);
        // System.out.println(num);
        //automatic type promotion in expression

        // int a = 257;
        // byte b = (byte)(a);         //257 % 256 = 1
        // System.out.println(b);

        // byte a = 40;
        // byte b = 50;
        // byte c = 100;
        // int d = (a * b) / c;
        // System.out.println(d);
        // input.close();

        // int number = 'A';           //automatic type conversion
        // System.out.println(number);

        // byte b = 42;
        // char c = 'a';
        // short s = 1024;
        // int i = 50000;
        // float f = 5.67f;
        // double d = 0.1234;
        // double result = (f * b) + (i / c)-(d - s);      //c converted to integer by ascii code
        // //float + int - double = double
        // System.out.println((f * b) + " " + (i / c)+ " " +(d - s));
        // System.out.println(result); 


            //basics of java 

        // int a = 10;
        // if (a==10){
        //     System.out.println("Hello World!");
        // }

        // int count = 1;
        // while(count!=5){
        //     System.out.println(count);
        //     count++;
        // }

        // for (int count = 1;count !=5; count++){
        //     System.out.println(count);
        // }

                //Temperature 
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter temp in celsius:");
        float tempC = in.nextFloat();

        float tempF = tempC * (9/5) + 32;
        System.out.println(tempF);
        in.close();
    }
}
