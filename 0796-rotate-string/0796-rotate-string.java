class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        
        // Step 2: Concatenate s with itself and check if goal is a substring
        String doubled = s + s;
        return doubled.contains(goal);
    }
}