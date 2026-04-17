class Solution {
    public boolean hasAlternatingBits(int n) {
        int lastBit=n%2;

           n /= 2;

        while (n > 0) {
            // Get the current rightmost bit
            int currentBit = n % 2;
            
            // If the current bit is the same as the last one, it's not alternating
            if (currentBit == lastBit) {
                return false;
            }
            
            // Update lastBit for the next iteration
            lastBit = currentBit;
            // Shift right to check the next bit
            n /= 2;
        }

        // If the loop completes without finding non-alternating bits, it is true
        return true;
        
    }
}