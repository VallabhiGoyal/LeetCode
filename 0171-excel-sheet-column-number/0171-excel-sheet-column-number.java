class Solution {
    public int titleToNumber(String columnTitle) {
        int n = columnTitle.length();
        if(n == 0) return 0;

        int num = 0;
        for(int i = 0; i<n; i++){
            num = num*26 + (int)columnTitle.charAt(i) - 64;
        }

        return num;
    }
}