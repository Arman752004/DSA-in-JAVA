package Functions;
import java.util.Scanner;;;

public class ArmstrongNumber {
    public static void main(String[] args) {
        //print all the 3 digits armstrong number
            Scanner in = new Scanner(System.in);
            // int n = in.nextInt();
            // System.out.println(isArmstrong(n));
            for (int i = 0 ; i < 1000;i++){
                if(isArmstrong(i)){
                    System.out.println(i + " ");        //ans-153,370,371,407
                }
            }
            in.close();
    }   
    static boolean isArmstrong(int n){
        int original  =n;
        int sum = 0;

        while(n>0){
            int rem = n % 10;
            n = n/10;
            sum += rem*rem*rem;
        }
        if (sum == original){
            return true ;
        }
        return false;
    }
}
