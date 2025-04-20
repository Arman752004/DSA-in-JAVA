package Binary_Search;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//       int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};  //ascending order
        int[] arr = {99,77,65,56,45,34,32,27,16,9,5};   //descending order
        int target = 56;
        int ans = orderAgnosticBs(arr, target);
        System.out.println(ans);
    }
    static int orderAgnosticBs(int[] arr,int target){
        int start = 0;
        int end = arr.length -1;

        //find whether the array is sorted in ascending or descending
        boolean isAsc;
        if(arr[start] < arr[end]){
            isAsc = true;
        }else{
            isAsc = false;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }
            if (isAsc){
                if(target < arr[mid]){
                    end = mid -1;
                }else{
                    start = mid + 1;}
            }else{
                if(target > arr[mid]){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}