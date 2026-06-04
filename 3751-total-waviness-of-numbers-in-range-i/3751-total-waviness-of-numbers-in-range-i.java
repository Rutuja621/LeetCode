class Solution {
    public int totalWaviness(int num1, int num2) {
        int totalSum = 0;
        for (int i = num1; i <= num2; i++) {
            totalSum += calculateWaviness(i);
        }
        return totalSum;
    }

    private int calculateWaviness(int num) {
        int[] digits = new int[15]; // Large enough to hold max int digits
        int count = 0;
        
        // Extract digits in reverse order
        while (num > 0) {
            digits[count++] = num % 10;
            num /= 10;
        }
        
        if (count < 3) return 0;
        
        int waviness = 0;
        // Since it's reversed, neighbors stay conceptually the same
        for (int i = 1; i < count - 1; i++) {
            if ((digits[i] > digits[i - 1] && digits[i] > digits[i + 1]) ||
                (digits[i] < digits[i - 1] && digits[i] < digits[i + 1])) {
                waviness++;
            }
        }
        return waviness;
    }
}
