class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedNumber = 0;
        int originalNumber = x;

        // Reverse the integer
        while (x > 0) {
            int lastDigit = x % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            x = x / 10;
        }

        // Check if the original number is equal to its reverse
        return originalNumber == reversedNumber;
    }
}