class Solution {
    public int numTilings(int n) {
        if(n <= 2) return n;
        if(n == 3) return 5; 

        int MOD = 1000000007;

        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 5;

        for(int i = 4; i<n+1; i++){
            dp[i] = ((2*dp[i-1]) % MOD + dp[i-3]) % MOD;
        }

        return dp[n];
    } 
}