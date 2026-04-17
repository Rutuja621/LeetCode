class Solution {
    public boolean containsDuplicate(int[] nums) {
      // 1. Sort the array so duplicates are adjacent
        Arrays.sort(nums);
        
        // 2. Iterate through the array (stopping before the last element)
        for (int i = 0; i < nums.length - 1; i++) {
            // 3. If current element equals the next element, a duplicate exists
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        
        // 4. If the loop finishes, all elements are distinct
        return false;
    }
}