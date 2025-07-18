package Recursion;

import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {
        triangle2(4, 0);
        int[] arr = {4,3,2,1};
        bubbleSort(arr, arr.length - 1,0);
        System.out.println(Arrays.toString(arr));
        selectionSort(arr, arr.length ,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void triangle(int r,int c){              //it will print the upside down triangle
        if(r==0){
            return;
        }
        if(c<r){        
            System.out.println("*");
            triangle(r, c + 1);
        }else{
            System.out.println();
            triangle(r - 1, 0);
        }
    }

    static void triangle2(int r,int c){             //it will print the normal right-angle triangle
        if(r==0){
            return;
        }
        if(c<r){
            triangle(r, c + 1);
            System.out.println("*");
        }else{
            triangle(r - 1, 0);
            System.out.println();
        }
    }

    static void bubbleSort(int[] arr,int r,int c){            
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                //swap
                int temp = arr[c];
                arr[c] = arr[r];
                arr[r] = temp;
            }
            bubbleSort(arr, r,c + 1);
        }else{
            bubbleSort(arr,r - 1, 0);
        }
    }

    static void selectionSort(int[] arr,int r,int c,int max){            
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[max]){
                selectionSort(arr, r, c + 1, c);
            }else{
                selectionSort(arr, r, c + 1, max);
            }
        }else{
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;

            selectionSort(arr,r-1,0,0);
        }
    }
}
