class Solution {
    public int coinChange(int[] coins, int amount) {
         if (amount == 0) return 0;

        int INF = amount + 1; // a value greater than any possible answer
        int[] dp = new int[amount + 1];
        for (int i = 1; i <= amount; i++) dp[i] = INF;
        dp[0] = 0;

        for (int coin : coins) {
            for (int x = coin; x <= amount; x++) {
                dp[x] = Math.min(dp[x], dp[x - coin] + 1);
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];

    }
}