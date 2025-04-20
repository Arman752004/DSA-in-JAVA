package Functions;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        // String message = greet();
        // System.out.println(message);

        // String personalised = myGreet("Kunal Kushwaha");
        // System.out.println(personalised);

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = in.next();
        // System.out.println("Hello " + name);
        String personalised1 = myGreet(name);
        System.out.println(personalised1);
        in.close();
    }
    static String myGreet(String name){
        String message = "Hello" + name ;
        return message;
    }
    static String  greet(){
        String greeting = "how are you";
        return greeting;
    }    
}