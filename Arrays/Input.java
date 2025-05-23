package Arrays;
import java.util.*;
public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        //array of primitives
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 233;
        arr[3] = 20;
        arr[4] = 39;
        System.out.println(arr[3]);

        //input using for loops
        for(int i= 0;i< arr.length;i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        // for (int i = 0;i<arr.length;i++){
        //     System.out.print(arr[i] + " ");
        // }

        //for-each loop
        // for (int num:arr){  //for every element in array, print the element 
        //     System.out.println(num + " "); //here num represents element of the array
        // }

        //System.out.println(arr[5]);  //it is an error because the length is 5 but the index is till 4


        //array of objects
        String[] str = new String[4];
        for(int i = 0;i<str.length;i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        in.close();

        //modify
        str[1] = "Kunal";
        System.out.println(Arrays.toString(str));
    }
}
