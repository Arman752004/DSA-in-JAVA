package Recursion;

public class product {
    public static void main(String[] args) {
        int ans = Product(1342);
        System.out.println(ans);
    }
    static int Product(int n){
        if(n % 10 == n){
            return n;
        }
        return (n % 10) * Product(n/10);
    }
}