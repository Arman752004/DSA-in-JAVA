package Binary_Search;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(countRotations(arr));
    }
    private static int countRotations(int[] arr){
        int pivot = findPivot(arr);
        // if(pivot == -1){
        //     //array is not rotated           //this is not necessary as -1+1 will became 0
        //     return 0;
        // }
        return pivot + 1;
    }
    //we can use this for non duplicates value
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
    //we can do this with duplicate numbers in Rotated binary search
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
    // }       
}
