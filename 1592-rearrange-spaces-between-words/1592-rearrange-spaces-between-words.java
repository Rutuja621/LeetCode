class Solution {
    public String reorderSpaces(String text) {
        int totalSpaces = 0;
        for (char c : text.toCharArray()) {
            if (c == ' ') totalSpaces++;
        }
        
        // Extract all words (trim first to avoid empty split arrays)
        String[] words = text.trim().split("\\s+");
        int wordCount = words.length;
        
        // Calculate gaps and remainder
        int spacesBetween = wordCount > 1 ? totalSpaces / (wordCount - 1) : 0;
        int extraSpaces   = wordCount > 1 ? totalSpaces % (wordCount - 1) : totalSpaces;
        
        // Join the words with the calculated number of spaces
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < wordCount; i++) {
            result.append(words[i]);
            if (i < wordCount - 1) {
                result.append(" ".repeat(spacesBetween));
            }
        }
        
        // Add the leftover spaces at the end
        result.append(" ".repeat(extraSpaces));
        
        return result.toString();
    }
}