class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        
        int n = nums.length;
        double minAvg = Double.MAX_VALUE;
        
        // 2. Pair the smallest (left) with the largest (right)
        for (int i = 0; i < n / 2; i++) {
            double currentAvg = (nums[i] + nums[n - 1 - i]) / 2.0;
            
            // 3. Update the overall minimum average
            if (currentAvg < minAvg) {
                minAvg = currentAvg;
            }
        }
        
        return minAvg;
    }
}