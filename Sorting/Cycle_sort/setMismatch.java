package Sorting.Cycle_sort;
//https://leetcode.com/problems/set-mismatch/

class setMismatch {
    public int[] findErrorNums(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){ //the first case before and is for nth term
                swap(arr , i , correct);
            }else{
                i++;
            }
        }
        //search for first missing numbers
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index + 1){
                return new int[] {arr[index] , index + 1};
            } 
        }
        return new int[] {-1,-1};
    }
    void swap (int[] arr,int first,int second){
        int temp = arr[ first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
