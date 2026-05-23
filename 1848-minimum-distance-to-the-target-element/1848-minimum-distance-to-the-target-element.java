class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
         int minDist = nums.length;  // worst case max distance

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                int dist = Math.abs(i - start);
                if (dist < minDist) {
                    minDist = dist;
                }
            }
        }

        return minDist;
    }
}