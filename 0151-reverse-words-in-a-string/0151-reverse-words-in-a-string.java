class Solution {
    public String reverseWords(String s) {
       String[] words = s.trim().split("\\s+");
        
        StringBuilder result = new StringBuilder();
        
        // Loop backwards through the words array
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            
            // Add a single space between words, but not after the last word
            if (i > 0) {
                result.append(" ");
            }
        }
        
        return result.toString();
    }
}