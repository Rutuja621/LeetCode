class Solution {
    public int lengthOfLongestSubstring(String s) {
         int[] lastSeen = new int[128];
        int maxLength = 0;
        int left = 0;

        // 'right' expands the sliding window
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If the character was seen inside the current window, move 'left' past its last position
            left = Math.max(left, lastSeen[currentChar]);

            // Calculate the current window size and update max length
            maxLength = Math.max(maxLength, right - left + 1);

            // Store the next valid index for this character (1-based indexing)
            lastSeen[currentChar] = right + 1;
        }

        return maxLength;
    }
}