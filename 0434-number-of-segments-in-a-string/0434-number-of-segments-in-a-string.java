class Solution {
    public int countSegments(String s) {
        int segments = 0;
        
        for (int i = 0; i < s.length(); i++) {
            // Check if current char is not a space, and (if it's the start
            // or the previous char was a space)
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
                segments++;
            }
        }
        
        return segments;
    }
}