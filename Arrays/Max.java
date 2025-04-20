package Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 2, 4));
    }

    //imagine that array is not empty
    static int max(int[] arr){
        if (arr.length == 0){
            return -1;
        }
        int maxVal = arr[0];           //if the array is empty than we can take Integer.MIN    
        for(int i = 1;i < arr.length ; i++){
            if (arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
    //work on edge cases here if the array is null or not
    static int maxRange(int[] arr,int start,int end){

        if (end>start){
            return -1;
        }
        if(arr == null){
            return -1;
        }
        int maxVal = arr[0];           //if the array is empty than we can take Integer.MIN    
        for(int i = start;i <= end ; i++){
            if (arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    };
}
