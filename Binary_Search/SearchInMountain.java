package Binary_Search;
//https://leetcode.com/problems/find-in-mountain-array/
public class SearchInMountain {
    public static void main(String[] args) {
        
    }
    int search(int[] arr,int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBs(arr,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        return orderAgnosticBs(arr, target, peak + 1, arr.length - 1);
    }
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]){
                //you are in decreasing part of the array
                //this may be the ans but look at left
                //this is why end != mid - 1
                end = mid;
            }else{
                //you are in ascending part of the array
                start = mid + 1; //as we know that mid + 1 elmnt > mid elmnt
            }
        }
        return start; //we can return anything start or end as both are equal
    }
    static int orderAgnosticBs(int[] arr,int target,int start,int end){
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
