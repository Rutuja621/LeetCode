class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) return false;

        int sum = 0;
        // Divisors can only exist up to half of the number
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i; // Add divisor to sum
            }
        }

        // Return true if the sum of divisors equals the original number
        return sum == num;
        
    }
}