package Arrays.Practice;
//https://leetcode.com/problems/running-sum-of-1d-array/description/

public class RunningSumOfOneDArray {
    public int[] runningSum(int[] nums) {
        int n = nums.length;

        for (int i = 1; i < n; i++) {       //0th index will not chage thats why starting from 1
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}
