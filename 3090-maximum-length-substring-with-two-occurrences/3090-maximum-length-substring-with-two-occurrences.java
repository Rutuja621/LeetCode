class Solution {
    public int maximumLengthSubstring(String s) {
        int[] count = new int[26];
        int maxLen = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            // Add the current character to our count
            count[s.charAt(right) - 'a']++;

            // While the current character appears more than twice, shrink from the left
            while (count[s.charAt(right) - 'a'] > 2) {
                count[s.charAt(left) - 'a']--;
                left++;
            }

            // Update the maximum length found so far
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}