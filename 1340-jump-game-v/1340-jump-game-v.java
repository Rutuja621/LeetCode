class Solution {
    private int[] dp;
    private int[] arr;
    private int d;
    private int n;

    public int maxJumps(int[] arr, int d) {
        this.arr = arr;
        this.d = d;
        this.n = arr.length;
        this.dp = new int[n];
        int ans = 1;

        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, dfs(i));
        }
        return ans;
    }

    private int dfs(int i) {
        if (dp[i] != 0) return dp[i];
        int max = 1;

        // Jump left
        for (int j = i - 1; j >= Math.max(0, i - d) && arr[j] < arr[i]; j--) {
            max = Math.max(max, 1 + dfs(j));
        }

        // Jump right
        for (int j = i + 1; j <= Math.min(n - 1, i + d) && arr[j] < arr[i]; j++) {
            max = Math.max(max, 1 + dfs(j));
        }

        return dp[i] = max;
    }
}
