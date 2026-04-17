class Solution {
    public void moveZeroes(int[] nums) {
           // Pointer to track the position of the next non-zero element
        int lastNonZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            // If the current element is non-zero
            if (nums[i] != 0) {
                // Swap current element with the element at lastNonZeroIndex
                int temp = nums[i];
                nums[i] = nums[lastNonZeroIndex];
                nums[lastNonZeroIndex] = temp;
                
                // Move the pointer forward
                lastNonZeroIndex++;
            }
        }
    }
}