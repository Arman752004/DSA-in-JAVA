package Arrays;
import java.util.*;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        1 2 3
        4 5 6
        7 8 9 
        */
        // int[][] arr = new int[3][3];     //the number of rows is mandatory wheras columns is not mandatory
        // int[][] arr = {
        //     {1,2,3},        //0th index 
        //     {4,5},          //1st index
        //     {6,7,8,9}       //2nd index     -> arr[2] = {6,7,8,9}
        // };

        int[][] arr = new int[3][4];
        // System.out.println(arr.length);  //no. of rows will get printed

        //input
        for (int row = 0;row < arr.length ;row++){
            for (int col = 0;col<arr[row].length ;col++){
                arr[row][col] = in.nextInt();
            } 
        }

        //output
        // for (int row = 0;row <= arr.length ; row++){
        //     //for each col in every row
        //     for(int col = 0; col < arr[row].length ; col++){
        //         System.out.print(arr[row][col] +  " ");
        //     }
        //     System.out.println();
        // } 


        // for (int row = 0;row < arr.length ; row++){
        //     System.out.println(Arrays.toString(arr[row]));
        // }

        //enhanced for loop for the above loop
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
        in.close();
    }
}
