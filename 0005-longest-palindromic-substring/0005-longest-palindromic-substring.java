class Solution {
    public String longestPalindrome(String s) {
         if (s == null || s.length() < 1) return "";
        
        int start = 0, maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            // Check odd-length palindromes (like "aba") and even-length palindromes (like "bb")
            for (int j = 0; j <= 1; j++) {
                int left = i;
                int right = i + j;

                // Expand outward from the center
                while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                    int currentLength = right - left + 1;
                    if (currentLength > maxLength) {
                        maxLength = currentLength;
                        start = left; // Track where the longest palindrome begins
                    }
                    left--;
                    right++;
                }
            }
        }

        return s.substring(start, start + maxLength);
    }
}