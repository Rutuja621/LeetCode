class Solution {
    public int lengthOfLIS(int[] nums) {
      if (nums == null || nums.length == 0) return 0;

        int[] tails = new int[nums.length];
        int size = 0; // current length of tails

        for (int x : nums) {
            // binary search for the insertion position of x in tails[0..size-1]
            int left = 0, right = size;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (tails[mid] < x) left = mid + 1;
                else right = mid;
            }
            // left is the position to replace or append
            tails[left] = x;
            if (left == size) size++;
        }
        return size;
    }
}