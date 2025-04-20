package Sorting.Cycle_sort;
//https://leetcode.com/problems/missing-number/
//Amazon Question

class missingNumber {
    public int missingnumber(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]){ //the first case before and is for nth term
                swap(arr , i , correct);
            }else{
                i++;
            }
        }
        //search for first missing numbers
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index){
                return index;
            } 
        }
        //case 2- if no missing number found
        return arr.length;
    }
    void swap (int[] arr,int first,int second){
        int temp = arr[ first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
