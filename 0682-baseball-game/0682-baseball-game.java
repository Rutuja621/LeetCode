class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();

        for (String op : ops) {
            if (op.equals("+")) {
                int last = stack.pop(); // Take out the last
                int newScore = last + stack.peek(); // Sum it with the next one
                stack.push(last); // Put the last one back
                stack.push(newScore); // Put the sum on top
            } else if (op.equals("D")) {
                stack.push(stack.peek() * 2);
            } else if (op.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int score : stack) sum += score;
        return sum;
        
    }
}