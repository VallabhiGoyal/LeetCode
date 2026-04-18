class Solution {
    public int numDecodings(String s) {
        int n = s.length();

        if(s.charAt(0) == '0') return 0;
        if(n == 1) return 1;

        int[] dp = new int[n];
        dp[0] = 1;
        
        dp[1] = 0;
        if(s.charAt(1) != '0'){
            dp[1] += dp[0];
            if((s.charAt(0) == '1') || (s.charAt(0) == '2' && s.charAt(1) <= '6')) dp[1] += 1;
        }
        else{
            if((s.charAt(0) == '1') || (s.charAt(0) == '2' && s.charAt(1) <= '6')) dp[1] += 1;
            else return 0;
        }

        for(int i = 2; i<n; i++){
            char curr = s.charAt(i);
            char prev = s.charAt(i-1);

            if(curr != '0'){
                dp[i] += dp[i-1];
                if((prev == '1') || (prev == '2' && curr <= '6')){
                    dp[i] += dp[i-2];
                }
            }else{
                if(prev == '1' || prev == '2'){
                    dp[i] += dp[i-2];
                }else return 0;
            }
        }    

        return dp[n-1];    
    }
}