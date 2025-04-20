public class LongestSubstringWithoutRepChr {
    public static int lengthOfLongestSubstring(String s) {
        int[] charIndex = new int[128]; // ASCII character set
        int maxLength = 0, left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            left = Math.max(left, charIndex[currentChar]); // Move left pointer
            maxLength = Math.max(maxLength, right - left + 1);
            charIndex[currentChar] = right + 1; // Store index + 1
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Length of longest substring: " + lengthOfLongestSubstring(s));
    }
}
