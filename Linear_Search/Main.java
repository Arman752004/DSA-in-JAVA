package Linear_Search;

public class Main {
    // public static void main(String[] args) {
    //     int[] nums = {2 ,34 ,5 ,6,66,78,88,332,4,32,455,64,55,11};
    //     int target = 66;
    //     int ans = linearSearch(nums, target);
    //     System.out.println(ans);

    // }
    // //search in the array:return the index if item found
    // //if item not found return -1
    // static int linearSearch(int[] arr,int target){
    //     if(arr.length == 0){
    //         return -1;
    //     }

    //     //run a loop
    //     for (int index = 0; index < arr.length; index++) {
    //         //check for element for every index if the element is =target
    //         int element = arr[index];
    //         if (element == target){
    //             return index;
    //         }
    //     }
    //     //this line will execute if none of the return statement above have executed hence target not found
    //     return -1;
    // }




    //search the target and and return the element
    // public static void main(String[] args) {
    //     int[] nums = {2 ,34 ,5 ,6,66,78,88,332,4,32,455,64,55,11};
    //     int target = 66;
    //     int ans = linearSearch(nums, target);
    //     System.out.println(ans);

    // }
    
    // static int linearSearch(int[] arr,int target){
    //     if(arr.length == 0){
    //         return -1;
    //     }

    //     //run a loop
    //     for(int element : arr){             //enhanced for loop
    //         if (element == target){
    //             return element;
    //         }
    //     }
    //     //this line will execute if none of the return statement above have executed hence target not found
    //     return -1;
    //}




    //search the target and return true or false
    static boolean linearSearch(int[] arr,int target){
        if(arr.length == 0){
            return false;
        }
    
            //run a loop
        for(int element : arr){             //enhanced for loop
            if (element == target){
                return true;
            }
        }
        //this line will execute if none of the return statement above have executed hence target not found
        return false;
    }
}
