package Recursion;
//checking if the arrays are sorted or not     
public class CheckingSortedArrays{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(sorted(arr, 6));
    }
    static boolean sorted(int[] arr,int index){
        //base condition
        if(index == arr.length - 1){
            return true;
        }

        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }
}