package Arrays.Practice;
//Rearranging the array based on its own values.
//https://leetcode.com/problems/build-array-from-permutation/
public class ArrayFromPermutation {
    public int[] buildArray(int[] nums){
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] + n*(nums[nums[i]] % n);
        }
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] / n;
        }
        return nums;
    }
}
