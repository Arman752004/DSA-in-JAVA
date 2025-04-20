
import java.util.Scanner;

public class Conditions_And_Loops{
    public static void main(String[] args) {
        // int salary = 25400;
        // if(salary>10000){
        //     salary = salary + 2000;
        // }else{
        //     salary = salary + 1000;
        // }

        // if(salary>10000){
        //     salary = salary + 2000;
        // }else if(salary>20000){
        //     salary = salary + 3000;
        // }else{
        //     salary = salary + 1000;
        // }
        // System.out.println(salary);

            //loops
        
        //Q:Print numbers in 1 to 5
        /*
        for(initialization;condition;inreament/decrement){
            //body
        }
        */
        // for(int i=1;i<=5;i += 1 ){
        //     System.out.println(i);
        // }

        //print number from 1 to n
        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        // for(int num = 1; num<=n ; num++ ){
            // System.out.println(num + " " );
        //     System.out.println("Hell World");
        // }
        // in.close();         //it is used to close the in 

        //while loop
        /*
        Syntax:
        initialization
        while(condition){
            //body
        }
        */
        // int num = 1;
        // while(num<=5){
        //     System.out.println(num);
        //     num += 1;
        // }

        //do-while loop
        /*
        syntax:
        do{
            //body
        }while(condition);
        */

        // int n = 1;
        // do{
        //     System.out.println(n);
        //     n++;
        // }while(n <= 5);
        // int i = 1;
        // do{
        //     System.out.println("Hello World");
        //     n++;
        // }while(i != 1);    //as it is false then also it will execute at least once because it is a do while loop
        //in do while loop the loop will execut atleast once and it will execute the body first and then check the condition



        //Q:which number is the largest

        // Scanner in = new Scanner(System.in);
        // int a = in.nextInt();
        // int b = in.nextInt();
        // int c = in.nextInt();

        // int max = a;
        // if(b>max){
        //     max = b;
        // }if(c>max){
        //     max = c;
        // }
        // System.out.println(max);

        // int max = 0;
        // if(a>max){
        //     max = a;
        // }if(b>max){
        //     max = b;
        // }if(c>max){
        //     max = c;
        // }
        // System.out.println(max);

        //using math.max
        // System.out.println(Math.max(34,57));
        // int max = Math.max(c,Math.max(a,b));
        // System.out.println(max);
        // in.close();




        //CaseCheck

        // Scanner in = new Scanner(System.in);
        // String word = "hello";
        // System.out.println(word.charAt(2));      

        // char ch =in.next().trim().charAt(0); //trim will remove all the extra spaces in the end of the output
        //charAt(0) refers to giving the character at this index
        // if(ch >= 'a' && ch<='z'){
        //     System.out.println("Lower Case");
        // }else{
        //     System.out.println("Upper Case");
        // }
        // System.out.println(ch);
        // in.close();

        

        //Fibonacci series
        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        // int a = 0;
        // int b = 1;
        // int count = 2;
        // while(count<=n){
        //     int temp = b;
        //     b = b + a;
        //     a = temp;
        //     count++;
        // }
        // System.out.println(b);

        

        //counting numbers

        // int n = 45536;
        // int count = 0;
        // while(n>0){
        //     int rem = n % 10;
        //     if(rem == 5){
        //         count++;
        //     }
        //     n = n /10;
        // }
        // System.out.println(count);


        //reversing number
        // int num = 28479;

        // int ans = 0;
        // while(num>0){
        //     int rem = num % 10; 
        //     num /=  10;
        //     ans = ans * 10 + rem; 
        // }
        // System.out.println(ans);



        //calculator

        Scanner in = new Scanner(System.in);
        //Take input from user till user does not press X or x
        int ans = 0;
        while (true) {
            //take the operator as input
            System.out.print("Enter the opereator!!");
            char op = in.next().trim().charAt(0);
            System.out.println();
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                //input two numbers
                System.out.println("Enter two numbers:");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                System.out.println();

                if (op=='+'){
                    ans = num1 + num2;
                }
                if (op=='-'){
                    ans = num1 - num2;
                }
                if (op=='*'){
                    ans = num1 * num2;
                }
                if (op=='/'){
                    if(num2 != 0){
                        ans = num1 /num2;
                    }
                }
                if (op=='%'){
                    ans = num1 % num2;
                }
                else if(op == 'x' || op =='X'){
                    break;
                }else{
                    System.out.println("Invalid operation");
                }
            }else if(op == 'x' || op =='X'){
                break;
            }else{
                System.out.println("Invalid operation");
            };
        System.out.println(ans);
        in.close();
        };  
    }
}
