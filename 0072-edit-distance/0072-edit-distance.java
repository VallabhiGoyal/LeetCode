class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        if(m == 0) return n;
        if(n == 0) return m;

        int[][] t = new int[m+1][n+1];

        for(int i = 0; i<m+1; i++){
            t[i][0] = i;
        }
        for(int j = 0; j<n+1; j++){
            t[0][j] = j;
        }


        for(int i = 1; i<m+1; i++){
            for(int j = 1; j<n+1; j++){
                if(word1.charAt(i-1) != word2.charAt(j-1)){
                    int best = Math.min(t[i-1][j], t[i-1][j-1]);
                    best = Math.min(t[i][j-1], best);
                    t[i][j] = 1 + best;
                }else{
                    t[i][j] = t[i-1][j-1];
                }
            }
        }

        return t[m][n];
    }
}