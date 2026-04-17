class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       List<Integer> result = new ArrayList<>();

        // 1. Mark each number's presence by negating the value at its corresponding index
        for (int i = 0; i < nums.length; i++) {
            // Use absolute value because the element might have already been negated
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        // 2. Identify missing numbers: indices that remain positive were never visited
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1); // Missing number is index + 1
            }
        }

        return result;
 
    }
}
        
    
