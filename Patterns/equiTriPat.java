package Patterns;

public class equiTriPat {
    public static void main(String[] args) {
        pattern1(5);
        
    }

    static void pattern1(int n){
        for (int row = 1; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row  : row;
            //for every row, run the col
            for (int col = 1; col < totalColsInRow; col++) {
                System.out.print(" * ");
            }
            //when one row is printed ,we need to add a new line
            System.out.println();
        }
    }
}
