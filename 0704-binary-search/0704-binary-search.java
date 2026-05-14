class Solution {
    public int search(int[] nums, int target) {
     
        // Kick off the recursive helper function with initial array boundaries
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    private int binarySearch(int[] nums, int target, int start, int end) {
        // Base case: Search space is exhausted, target not found
        if (start > end) {
            // Target does not exist in nums
            return -1; 
        }

        // Calculate mid pointer to prevent integer overflow
        int mid = start + (end - start) / 2;

        // Base case: Target found
        if (nums[mid] == target) {
            return mid;
        }

        // Recursive step: Eliminate half of the remaining search space
        if (target < nums[mid]) {
            // Target is smaller, search the left half
            return binarySearch(nums, target, start, mid - 1);
        } else {
            // Target is larger, search the right half
            return binarySearch(nums, target, mid + 1, end);
        }
    }
}