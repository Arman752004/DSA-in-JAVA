package Functions;

import java.util.Arrays;
public class ChangeValue {
    public static void main(String[] args) {
        //create an array
        int[] arr = {1,2,4,44,66};
        change(arr);
        System.out.println(Arrays.toString(arr));   
    }
    static void change(int[] nums){
        nums[0] = 99;
    }
}