package Functions;
import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
        in.close();
    }
    static boolean isPrime(int n){
        if (n <= 1){
            System.out.println(false);
        }
        int c = 2;
        while(c * c <= n){
            if (n% c == 0){
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
