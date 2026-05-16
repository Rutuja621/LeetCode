class Solution {
    public int numberOfSpecialChars(String word) {
       boolean[] lower = new boolean[26];
        boolean[] upper = new boolean[26];
        
        // Step 1: Record every character seen in the string
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isLowerCase(ch)) {
                lower[ch - 'a'] = true;
            } else if (Character.isUpperCase(ch)) {
                upper[ch - 'A'] = true;
            }
        }
        
        int specialCount = 0;
        
        // Step 2: Count how many letters exist in both arrays
        for (int i = 0; i < 26; i++) {
            if (lower[i] && upper[i]) {
                specialCount++;
            }
        }
        
        return specialCount;
    }
}