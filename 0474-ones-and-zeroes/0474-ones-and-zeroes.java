class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int len = strs.length;

        int[][] t = new int[len][2];

        for(int i = 0; i<len; i++){
            String s = strs[i];
            int size = s.length();

            for(int j = 0; j<size; j++){
                if(s.charAt(j) == '0') t[i][0]++;
                else t[i][1]++;
            }
        }

        int[][] dp = new int[m+1][n+1];

        for(int i = 0; i<len; i++){
            for(int j = m; j>=0; j--){
                for(int k = n; k>=0; k--){
                    if(t[i][0] <= j && t[i][1] <= k){
                        dp[j][k] = Math.max(dp[j][k], 1 + dp[j - t[i][0]][k - t[i][1]]);
                    }
                }
            }
        }

        return dp[m][n];
    }
}