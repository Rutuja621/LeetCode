class Solution {
    public int smallestDistancePair(int[] nums, int k) {
      Arrays.sort(nums); // 1. Always sort first
        
        int low = 0;
        int high = nums[nums.length - 1] - nums[0]; // Max possible distance
        
        while (low < high) {
            int mid = (low + high) / 2;
            int count = 0;
            int left = 0;
            
            // 2. Count how many pairs have a distance <= mid
            for (int right = 0; right < nums.length; right++) {
                while (nums[right] - nums[left] > mid) {
                    left++;
                }
                count += (right - left); 
            }
            
            // 3. Narrow down the search for the kth distance
            if (count >= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
        
    }
}