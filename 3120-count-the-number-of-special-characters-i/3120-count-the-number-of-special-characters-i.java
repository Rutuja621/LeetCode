class Solution {
    public int numberOfSpecialChars(String word) {
          HashSet<Character> seen = new HashSet<>();
        
        // Add all characters to a set to remove duplicates
        for (int i = 0; i < word.length(); i++) {
            seen.add(word.charAt(i));
        }
        
        int specialCount = 0;
        
        // Check every character in the set
        for (char ch : seen) {
            // If it's lowercase and its uppercase pair is also in the set
            if (Character.isLowerCase(ch) && seen.contains(Character.toUpperCase(ch))) {
                specialCount++;
            }
        }
        
        return specialCount;
    }
}