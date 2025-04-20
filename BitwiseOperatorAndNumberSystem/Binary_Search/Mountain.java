package Binary_Search;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class Mountain {
    public static void main(String[] args) {
        
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
        //in the end, start == end and pointing to the largest number because of the 2 checks above
        //start and end are always trying to find max element in the above two checks
        //hence,when they are pointing to just one element,that is the maximum one because that is what the checks say 
        //more elaboration: at every point of time for start and end, they have the best possible answer till that time
        //and if we are saying that only one item is remaining, hence cuz of above line that is  the best possible answer
        return start; //we can return anything start or end as both are equal
    }
}
