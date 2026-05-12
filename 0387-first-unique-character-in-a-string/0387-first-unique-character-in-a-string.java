class Solution {
    public int firstUniqChar(String s) {
      for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // If the first occurrence index is the same as the last occurrence index,
            // it means the character only appears once.
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                return i;
            }
        }
        return -1;

    }
}