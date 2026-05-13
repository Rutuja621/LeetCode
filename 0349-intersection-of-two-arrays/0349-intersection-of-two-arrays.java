class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] seen = new boolean[1001];
        
        // Mark existing elements from the first array
        for (int num : nums1) {
            seen[num] = true;
        }
        
        int[] temp = new int[1001];
        int index = 0;
        
        // Find intersections
        for (int num : nums2) {
            if (seen[num]) {
                temp[index++] = num;
                seen[num] = false; // Mark false to prevent duplicate additions
            }
        }
        
        return Arrays.copyOf(temp, index);
      
    }
}