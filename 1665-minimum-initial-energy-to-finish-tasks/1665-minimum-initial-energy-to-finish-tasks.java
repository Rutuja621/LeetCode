class Solution {
    public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks, (a, b) -> (b[1] - b[0]) - (a[1] - a[0]));

        int currentEnergy = 0;
        int initialEnergy = 0;

        for (int[] task : tasks) {
            int actual = task[0];
            int minimum = task[1];

            // If current energy is less than the minimum required for this task
            if (currentEnergy < minimum) {
                // Add the deficit to our total starting energy
                initialEnergy += (minimum - currentEnergy);
                // Set current energy to the minimum needed to start
                currentEnergy = minimum;
            }
            
            // Deduct the actual cost of the task
            currentEnergy -= actual;
        }

        return initialEnergy;
    }
}