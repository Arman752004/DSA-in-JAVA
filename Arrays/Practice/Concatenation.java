package Arrays.Practice;
//https://leetcode.com/problems/concatenation-of-array/
public class Concatenation {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for(int i = 0;i<n;i++){
            ans[i] = nums[i];
            ans[i + n] = nums[i];       //ans[1 + 3] = nums[i]      {1,0,0,1,0,0},{1,2,0,1,2,0},{1,2,1,1,2,1}
        }
        return ans;
    }
}
