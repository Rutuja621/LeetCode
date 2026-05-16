class Solution {
    public int numberOfSpecialChars(String word) {
        int specialCount = 0;
        
        // Loop through all 26 lowercase alphabet letters
        for (char ch = 'a'; ch <= 'z'; ch++) {
            String lower = String.valueOf(ch);
            String upper = String.valueOf(Character.toUpperCase(ch));
            
            // Check if both the lowercase and uppercase forms exist in the word
            if (word.contains(lower) && word.contains(upper)) {
                specialCount++;
            }
        }
        
        return specialCount;
    }
}