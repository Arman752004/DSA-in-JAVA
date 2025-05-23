package Binary_Search;
//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class RotatedBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
    }
    static int search(int[] nums,int target){
        int pivot = findPivot(nums);

        //if you did not have the pivot,it means the array is not rotated
        if (pivot == -1){
            //just do normal binary search
            return binarySearch(nums, target, 0, nums.length -1);
        }
        //if pivot is found you have found two asc sorted arrays
        if(nums[pivot] == target ){
            return pivot;
        }
        if(target >= nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
        }
        return binarySearch(nums, target, pivot + 1, nums.length -1);
    }
    static int binarySearch(int[] arr,int target,int start,int end){
        while (start <= end) {
            // int mid = (start + end)/2;  //might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid -1;
            }else if (target > arr[mid]){
                start = mid + 1;
            }else{
                //ans found
                return mid;
            }
        }
        return -1;
    }
    // this will not work in duplicate values    
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            //these 4 cases can be used to solve the problem 
            //1st case 
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            //2nd case
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            //3rd case
            if (arr[mid] <= arr[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
    // static int findPivotWithDuplicates(int[] arr){
    //     int start = 0;
    //     int end = arr.length - 1;
    //     while(start <= end){
    //         int mid = start + (end - start)/2;
    //         //these 4 cases can be used to solve the problem 
    //         //1st case 
    //         if(mid < end && arr[mid] > arr[mid + 1]){
    //             return mid;
    //         }
    //         //2nd case
    //         if(mid > start && arr[mid] < arr[mid - 1]){
    //             return mid - 1;
    //         }
    //         //if elements in the start,middle and end are similar then skip the duplicates
    //         if(arr[mid] == arr[start] && arr[mid]==arr[end]){
    //             //skip the duplicates
    //             //NOTE: what if these elements at start and end were the pivot??
    //             //check if start is pivot
    //             if(arr[start] > arr[start + 1]){
    //                 return start;
    //             }
    //             start++;
    //             //check also whether end is pivot or not
    //             if(arr[end] < arr[end - 1]){
    //                 return end - 1;
    //             }
    //             end--;
    //         }
    //         //left side is sorted, so pivot should be on right 
    //         else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]){
    //             start = mid + 1;
    //         }else{
    //             end = mid - 1;
    //         }
    //     }
    //     return -1;
    // }            //we can do this with duplicate numbers in Rotated binary search
}
