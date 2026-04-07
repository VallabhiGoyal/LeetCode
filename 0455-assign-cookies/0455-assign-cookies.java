class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int m = g.length;
        int n = s.length;

        Arrays.sort(g);
        Arrays.sort(s);

        int ans = 0;
        int j = n-1;
        for(int i = m-1; i>=0; i--){
            if(j>=0 && g[i] <= s[j]){
                ans++;
                j--;
            }
        }

        return ans;
    }
}