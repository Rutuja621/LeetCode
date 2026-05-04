class Solution {
  
    public String longestNiceSubstring(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 2; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                if (isNice(sub) && sub.length() > res.length()) {
                    res = sub;
                }
            }
        }
        return res;
    }

    private boolean isNice(String sub) {
        for (char c : sub.toCharArray()) {
            if (sub.indexOf(Character.toLowerCase(c)) == -1 || 
                sub.indexOf(Character.toUpperCase(c)) == -1) return false;
        }
        return true;
    }
  
}