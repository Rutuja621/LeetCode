class Solution {
    public int findDuplicate(int[] nums) {
          // Step 1: Find where the slow and fast pointers meet
        int slow = nums[0];
        int fast = nums[0];
        
        do {
            slow = nums[slow];        // Move 1 step
            fast = nums[nums[fast]]; // Move 2 steps
        } while (slow != fast);
        
        // Step 2: Find the entrance to the cycle (the duplicate)
        slow = nums[0];              // Reset slow to start
        while (slow != fast) {
            slow = nums[slow];        // Move both 1 step
            fast = nums[fast];
        }
        
        return slow; 
        
    }
}