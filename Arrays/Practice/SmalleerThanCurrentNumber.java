package Arrays.Practice;
//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

public class SmalleerThanCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if(nums[j]<nums[i]){
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}
