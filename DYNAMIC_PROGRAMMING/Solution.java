import java.util.*;

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

    // recursion + memoization
    public int solveUsingMemoisation(int n, ArrayList<Integer> dp) {
        // base case
        if (n == 0)
            return 0;
        if (n == 1) {
            return 1;
        }
        // step3: check if already exists, then return ans
        if (dp.get(n) != -1) {
            return dp.get(n);
        }
        // recursive relation
        // step2: store ans in dp array
        dp.set(n, solveUsingMemoisation(n - 1, dp) + solveUsingMemoisation(n - 2, dp));
        return dp.get(n);
    }

    // tabulation method
    public int solveUsingTabulation(int n) {
        // step1: create dp array
        ArrayList<Integer> dp = new ArrayList<>();
        for (int i = 0; i <= n; i++) dp.add(-1);
        // step2: analyze base case and fill dp array
        dp.set(0, 0);
        if (n == 0) {
            return 0;
        }
        dp.set(1, 1);
        // step3: fill the remaining dp array
        for (int index = 2; index <= n; index++) {
            // copy recursive logic, replace recursive calls with dp array
            dp.set(index, dp.get(index - 1) + dp.get(index - 2));
        }
        // return ans
        return dp.get(n);
    }

    // tabulation with space optimization
    public int solveUsingTabulationSpaceOptimised(int n) {
        int prev = 0;
        if (n == 0) {
            return 0;
        }
        int curr = 1;
        if (n == 1) {
            return 1;
        }
        int ans = 0;
        for (int index = 2; index <= n; index++) {
            ans = curr + prev;
            // move prev and curr one step forward
            prev = curr;
            curr = ans;
        }
        // return ans
        return ans;
    }

    public int fib(int n) {
        // int ans = solveUsingRecursion(n);
        // return ans;

        // ArrayList<Integer> dp = new ArrayList<>(Collections.nCopies(n + 1, -1));
        // int ans = solveUsingMemoisation(n, dp);
        // return ans;

        // int ans = solveUsingTabulation(n);
        // return ans;

        return solveUsingTabulationSpaceOptimised(n);
    }
}
