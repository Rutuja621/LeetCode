class Solution {
    public int firstMatchingIndex(String s) {
        int n = s.length();

        // Iterate through the first half of the string
        for (int i = 0; i < n; i++) {
            // Check if character matches its mirror position
            if (s.charAt(i) == s.charAt(n - i - 1)) {
                return i;
            }
        }

        // No matching index found
        return -1;
    }
}