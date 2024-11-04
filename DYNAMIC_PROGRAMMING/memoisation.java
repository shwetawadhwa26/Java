class Solution {
    // plain recursion
    public int solveUsingRecursion(int n) {
        // base case
        if (n == 0)
            return 0;
        if (n == 1) {
            return 1;
        }
        // recursive relation
        int ans = solveUsingRecursion(n - 1) + solveUsingRecursion(n - 2);
        return ans;
    }

    // recursion + memo
    public int solveUsingMemoisation(int n, int[] dp) {
        // base case
        if (n == 0)
            return 0;
        if (n == 1) {
            return 1;
        }
        // check if already exists, then return ans
        if (dp[n] != -1) {
            return dp[n];
        }
        // recursive relation and store ans in dp array
        dp[n] = solveUsingMemoisation(n - 1, dp) + solveUsingMemoisation(n - 2, dp);
        return dp[n];
    }
}
