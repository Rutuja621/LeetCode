class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int minFinish = Integer.MAX_VALUE;
        int n = landStartTime.length;
        int m = waterStartTime.length;

        // Try every possible pair of land and water rides
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                
                // Plan 1: Land ride first, then Water ride
                int plan1 = Math.max(landStartTime[i] + landDuration[i], waterStartTime[j]) + waterDuration[j];
                
                // Plan 2: Water ride first, then Land ride
                int plan2 = Math.max(waterStartTime[j] + waterDuration[j], landStartTime[i]) + landDuration[i];
                
                // Find the best scenario between the two plans for the current pair
                int currentBest = Math.min(plan1, plan2);
                
                // Track the absolute minimum finish time
                minFinish = Math.min(minFinish, currentBest);
            }
        }
        return minFinish;
        
    }
}