package Sorting.Merge_Sort;
import java.util.Arrays;

public class InPlaceMerge {
    public static void main(String[] args) {
        int[] arr =  {5,1,3,46,7,86,22};
        mergeSortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSortInPlace(int[] arr,int s,int e){
        if(e - s == 1){
            return;
        }
        int mid = s + (e - s) / 2;

        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr,s,mid,e);
    }
    private static void mergeInPlace(int[] arr,int s,int m,int e){
        int[] mix = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while(i < m && j < e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0;l < mix.length; l++) {
            arr[s+l]  = mix[l];
        }
    }
}
