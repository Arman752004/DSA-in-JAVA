package Arrays;

public class PassinginFunction {
    public static void main(String[] args) {
        int[] nums = {3,4,5,12};
        System.out.println(nums);
        change(nums);
        System.out.println(nums);
    }
    static void change(int[] arr){
        arr[0] = 99;
    }
}