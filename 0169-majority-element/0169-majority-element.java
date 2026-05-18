class Solution {
    public int majorityElement(int[] nums) {


        int candidate = nums[0];
        int count = 1;
        
        // Phase 1: Identify the majority candidate
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
                count = 1;
            } else if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }
        
        return candidate;

        /*
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
        */
      
        
    }
}