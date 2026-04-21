class Solution {
    public int hammingDistance(int x, int y) {
         int xor = x ^ y;
        int distance = 0;
        
        // Count set bits (1s) in the XOR result
        while (xor > 0) {
            // Brian Kernighan’s Algorithm: clears the least significant set bit
            xor &= (xor - 1);
            distance++;
        }
        
        return distance;
    }
}