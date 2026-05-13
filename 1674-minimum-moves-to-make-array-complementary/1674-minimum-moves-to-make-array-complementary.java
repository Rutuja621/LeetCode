class Solution {
    public int minMoves(int[] nums, int limit) {
          int n = nums.length;
        // The possible target sum X ranges from 2 to 2 * limit
        // We use a difference array to track the changes in moves required
        int[] delta = new int[2 * limit + 2];
        
        for (int i = 0; i < n / 2; i++) {
            int a = nums[i];
            int b = nums[n - 1 - i];
            
            // Critical boundaries for target sum X
            int minSum = Math.min(a, b) + 1;
            int maxSum = Math.max(a, b) + limit;
            int exactSum = a + b;
            
            // Case 1: Target sum X is outside [minSum, maxSum] -> Requires 2 moves
            // We assume 2 moves by default for the entire range [2, 2 * limit]
            delta[2] += 2;
            delta[2 * limit + 1] -= 2;
            
            // Case 2: Target sum X is within [minSum, maxSum] -> Requires 1 move
            // We subtract 1 move from the range [minSum, maxSum]
            delta[minSum] -= 1;
            delta[maxSum + 1] += 1;
            
            // Case 3: Target sum X is exactly a + b -> Requires 0 moves
            // We subtract 1 more move for exactly this sum
            delta[exactSum] -= 1;
            delta[exactSum + 1] += 1;
        }
        
        int minMoves = n; // Maximum possible moves is n (2 moves per pair)
        int currentMoves = 0;
        
        // Prefix sum sweep to find the absolute minimum moves
        for (int x = 2; x <= 2 * limit; x++) {
            currentMoves += delta[x];
            minMoves = Math.min(minMoves, currentMoves);
        }
        
        return minMoves;
    }
}