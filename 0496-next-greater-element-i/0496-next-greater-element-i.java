class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nextGreater = new int[10001];
        Stack<Integer> stack = new Stack<>();

        // 1. Process nums2 with a standard for loop
        for (int i = 0; i < nums2.length; i++) {
            int current = nums2[i];
            while (!stack.isEmpty() && stack.peek() < current) {
                nextGreater[stack.pop()] = current;
            }
            stack.push(current);
        }

        // Remaining elements in stack have no next greater element
        while (!stack.isEmpty()) {
            nextGreater[stack.pop()] = -1;
        }

        // 2. Build the result for nums1
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = nextGreater[nums1[i]];
        }

        return ans;
    
    }
}