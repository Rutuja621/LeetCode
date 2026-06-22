class Solution {
    public int maxNumberOfBalloons(String text) {
    
        String target = "balloon"; 
        
     
        int[] counts = new int[26];
        
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            
        
            if (target.indexOf(currentChar) != -1) {
                counts[currentChar - 'a']++;
            }
        }
        
    
        int maxWords = 0;
        while (true) {
       
            if (counts['b' - 'a'] >= 1 && 
                counts['a' - 'a'] >= 1 && 
                counts['l' - 'a'] >= 2 && 
                counts['o' - 'a'] >= 2 && 
                counts['n' - 'a'] >= 1) {
                
                // Deduct the used letters from our pool
                counts['b' - 'a'] -= 1;
                counts['a' - 'a'] -= 1;
                counts['l' - 'a'] -= 2;
                counts['o' - 'a'] -= 2;
                counts['n' - 'a'] -= 1;
                
                maxWords++; // Successfully formed one word!
            } else {
     
                break; 
            }
        }
        
        return maxWords;
    }
}