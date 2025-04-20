package Functions;

import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        sum();
        int ans = sum2();
        System.out.println(ans);

        int ans1 = sum3(20,30);
        System.out.println(ans1);
    }

    //pass the value of numbers when you are calling the method in main()
    static int sum3(int a,int b){
        int sum = a + b;
        return sum;
    }    
    //return the value
    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1 = in.nextInt();
        System.out.println("Enter number 2:");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        in.close();
        return sum;   //return should be at last if there will be a statement after that it will give error
        //System.out.println("hello");
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1 = in.nextInt();
        System.out.println("Enter number 2:");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum: " + sum);
        in.close();
    }
    /*
    return_type name(){
        //body
        return statement;
    }
    */
    
}
