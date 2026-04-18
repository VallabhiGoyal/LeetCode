class Solution {
    public int numDecodings(String s) {
        int n = s.length();

        if(s.charAt(0) == '0') return 0;

        int[] dp = new int[n];
        dp[0] = 1;

        for(int i = 1; i<n; i++){
            dp[i] = 0;

            char curr = s.charAt(i);
            char prev = s.charAt(i-1);

            if(curr != '0'){
                dp[i] += dp[i-1];
            }

            if(prev == '1' || (prev == '2' && curr <= '6')){
                if(i >= 2) dp[i] += dp[i-2];
                else dp[i] += 1;
            }

            if(dp[i] == 0) return 0;
        }    

        return dp[n-1];    
    }
}