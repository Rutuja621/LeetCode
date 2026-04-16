class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        
        int leftProduct = 1;
        int rightProduct = 1;

        for (int i = 0; i < n; i++) {
            // If the product becomes 0, reset it to 1 to "restart"
            if (leftProduct == 0) {
                leftProduct = 1;
            }
            if (rightProduct == 0) {
                rightProduct = 1;
            }

            // Multiply by the current element from the left
            leftProduct = leftProduct * nums[i];
            
            // Multiply by the current element from the right
            rightProduct = rightProduct * nums[n - 1 - i];

            // Compare which one is bigger so far
            int currentMax = Math.max(leftProduct, rightProduct);
            if (currentMax > max) {
                max = currentMax;
            }
        }

        return max;


    }
}