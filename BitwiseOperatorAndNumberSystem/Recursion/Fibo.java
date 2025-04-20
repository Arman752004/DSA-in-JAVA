package Recursion;

public class Fibo {
    public static void main(String[] args) {
        int ans = fibo(4);    //we cant use this for bigger number like 50
        System.out.println(ans);
    }
    static int fibo(int n){

        //base condition
        if(n<2){
            return n; //if n will be 0 then it will return 0 and if it is 1 then it will return 1
        }
        return fibo(n-1) + fibo(n-2);
    }
}
