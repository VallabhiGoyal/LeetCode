class Solution {
    public int titleToNumber(String columnTitle) {
        int n = columnTitle.length();
        if(n == 0) return 0;

        int k = 1;
        int num = 0;
        for(int i = n -1; i>=0; i--){
            char ch = columnTitle.charAt(i);
            int curr = (int)ch - 64;
            num = num + curr*k;
            k *= 26;
        }

        return num;
    }
}