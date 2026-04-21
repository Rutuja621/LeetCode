class Solution {
    public int reachNumber(int target) {
           // Step 1: Treat target as positive due to symmetry
        target = Math.abs(target);
        
        int sum = 0;
        int numMoves = 0;
        
        // Step 2: Keep moving forward until we reach or pass the target
        while (sum < target) {
            numMoves++;
            sum += numMoves;
        }
        
        // Step 3: If the difference (overshoot) is odd, we need more moves
        // because flipping any previous move 'i' changes the sum by 2*i (even).
        while ((sum - target) % 2 != 0) {
            numMoves++;
            sum += numMoves;
        }
        
        return numMoves;
    }
}