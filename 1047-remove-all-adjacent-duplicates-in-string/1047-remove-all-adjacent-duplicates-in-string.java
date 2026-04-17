class Solution {
    public String removeDuplicates(String s) {
          Stack<Character> stack = new Stack<>();
    
    // Standard for loop using an index
    for (int i = 0; i < s.length(); i++) {
        char current = s.charAt(i);
        
        // If stack is not empty and top element matches current char
        if (!stack.isEmpty() && stack.peek() == current) {
            stack.pop();
        } else {
            stack.push(current);
        }
    }
    
    // Build the final string from the stack
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < stack.size(); i++) {
        sb.append(stack.get(i));
    }
    
    return sb.toString();
    }
}