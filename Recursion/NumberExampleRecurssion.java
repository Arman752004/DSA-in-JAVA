package Recursion;

public class NumberExampleRecurssion {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        if(n==5){       //this is a check that after 5 nothing should be executed and its the end
            System.out.println(5);
            return;
        }
        System.out.println(n);
        //recursive call
        // if u are calling a fucntion again and again,you can treat it as a separate call in the stack

        // this is called tail recurison
        // this is the last function call
        print(n + 1);
    }

}
