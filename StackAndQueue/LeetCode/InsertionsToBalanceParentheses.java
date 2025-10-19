package StackAndQueue.LeetCode;
//https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/description/
//do coding as per the next file

public class InsertionsToBalanceParentheses {
    public int minInsertions(String s) {
        int res = 0;
        int need = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                need += 2;
                if (need % 2 == 1) {
                    res++;
                    need--;
                }
            } else {
                need--;
                if (need < 0) {
                    res++;
                    need = 1;
                }
            }
        }
        return res + need;
    }
}
