class Solution {
    public String minWindow(String s, String t) {
        int m = s.length();
        int n = t.length();
        if (m == 0 || n == 0) return "";

        // Frequency arrays for ASCII characters
        int[] need = new int[128];   // count of chars in t
        int[] window = new int[128]; // count of chars in current window

        // Fill need[] with frequency of t
        for (char c : t.toCharArray()) {
            need[c]++;
        }

        int left = 0, right = 0;
        int have = 0; // how many chars matched so far
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (right < m) {
            char c = s.charAt(right);
            window[c]++;

            // If this char is needed and we haven't exceeded its count
            if (need[c] > 0 && window[c] <= need[c]) {
                have++;
            }

            // When we have all chars of t in window
            while (have == n) {
                // Update answer if smaller window found
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                // Shrink from left
                char leftChar = s.charAt(left);
                window[leftChar]--;
                if (need[leftChar] > 0 && window[leftChar] < need[leftChar]) {
                    have--;
                }
                left++;
            }
            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
