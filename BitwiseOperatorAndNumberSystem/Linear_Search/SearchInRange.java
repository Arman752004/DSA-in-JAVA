package Linear_Search;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,1,28};  
        int target =3;
        System.out.println(linearSearch(arr, target, 1, 4));
    }
    static int linearSearch(int[] arr,int target,int start,int end){
        if(arr.length == 0){
            return -1;
        }

        //run a loop
        for (int index = start; index < end; index++) {
            //check for element for every index if the element is =target
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        //this line will execute if none of the return statement above have executed hence target not found
        return -1;
    }
}
