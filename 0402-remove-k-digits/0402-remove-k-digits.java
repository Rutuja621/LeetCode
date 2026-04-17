class Solution {
    public String removeKdigits(String num, int k) {
         // Edge case: if we remove all digits
    if (k == num.length()) return "0";
    
    Stack<Character> stack = new Stack<>();
    
    // Standard for loop to iterate through the digits
    for (int i = 0; i < num.length(); i++) {
        char current = num.charAt(i);
        
        // While we can still remove digits AND the top of stack is greater than current
        while (k > 0 && !stack.isEmpty() && stack.peek() > current) {
            stack.pop();
            k--;
        }
        stack.push(current);
    }
    
    // If k is still > 0, remove remaining digits from the end (the largest ones)
    while (k > 0) {
        stack.pop();
        k--;
    }
    
    // Build the string from the stack
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < stack.size(); i++) {
        sb.append(stack.get(i));
    }
    
    // Remove leading zeros
    while (sb.length() > 1 && sb.charAt(0) == '0') {
        sb.deleteCharAt(0);
    }
    
    return sb.length() == 0 ? "0" : sb.toString();
    }
}