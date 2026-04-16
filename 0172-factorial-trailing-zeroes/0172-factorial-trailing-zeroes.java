class Solution {
    public int trailingZeroes(int n) {
         int count = 0;
        
        // Count how many multiples of 5, 25, 125, etc., are in n
        while (n >= 5) {
            count += n / 5;
            n /= 5; // Divide by 5 to count higher powers of 5 (5^2, 5^3...)
        }
        
        return count;
    }
}