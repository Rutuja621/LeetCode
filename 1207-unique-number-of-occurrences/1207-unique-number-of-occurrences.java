class Solution {
    public boolean uniqueOccurrences(int[] arr) {
      for (int i = 0; i < arr.length; i++) {
            // 1. Count total occurrences of arr[i]
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // 2. Compare this count against the counts of other numbers
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] != arr[j]) { // Only check different numbers
                    int otherCount = 0;
                    for (int k = 0; k < arr.length; k++) {
                        if (arr[j] == arr[k]) {
                            otherCount++;
                        }
                    }
                    // If two different numbers have the same frequency, return false
                    if (count == otherCount) {
                        return false;
                    }
                }
            }
        }
        // If no duplicate frequencies are found, return true
        return true;
    }
}