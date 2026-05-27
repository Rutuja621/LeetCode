class Solution {
    public int numberOfSpecialChars(String word) {
         boolean[] hasLower = new boolean[26];
        boolean[] hasUpper = new boolean[26];
        boolean[] isInvalid = new boolean[26];

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (Character.isLowerCase(c)) {
                int idx = c - 'a';
                hasLower[idx] = true;
                // If we already saw uppercase, this lowercase breaks the rule
                if (hasUpper[idx]) {
                    isInvalid[idx] = true;
                }
            } else {
                int idx = c - 'A';
                hasUpper[idx] = true;
            }
        }

        // Count letters that have both cases and never broke the rule
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (hasLower[i] && hasUpper[i] && !isInvalid[i]) {
                count++;
            }
        }

        return count;
    }
}