package Patterns;
//horizontal Numeric Equilateral Triangle

public class horNumEquiTriPat {
    public static void main(String[] args) {
    }
    static void pattern30(int n){
        for (int row = 0; row <= n; row++) {
            for (int space = 0; space < n - row; space++) {     //we have to count spaces from left hand side
                System.out.println(" ");
            }
            for(int col = row ; col >= 1;col--){        //the structure will be like this 4321 for the first half
                System.out.println(col + " ");
            }
            for (int col = 2; col <= row; col++) {      //this structure is hor 234  which comes after 4321
                System.out.println(col);       
            }

            System.out.println();
        }
    }
}
