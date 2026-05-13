class Solution {
    public int findNumbers(int[] nums) {

        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            int numberOfDigits = 0;
            
            // Count how many digits are in the current number
            while (temp > 0) {
                temp /= 10;
                numberOfDigits++;
            }
            
            // Check if that count is even
            if (numberOfDigits % 2 == 0) {
                count++;
            }
        }
        
        return count;
    }
}