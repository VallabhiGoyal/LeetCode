class Solution {
    public int titleToNumber(String columnTitle) {
        int n = columnTitle.length();
        if(n == 0) return 0;

        int num = 0;
        for(int i = 0; i<n; i++){
            char ch = columnTitle.charAt(i);
            int curr = (int)ch - 64;
            num = num*26 + curr;
        }

        return num;
    }
}