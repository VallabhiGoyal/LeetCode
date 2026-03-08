class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n <= 1) return s;

        int maxLen = 0;
        String ans = new String();
        for(int i = 0; i<n; i++){
            int left = i - 1;
            int right = i + 1;
            //odd length
            while(left>=0 && right<n && s.charAt(left) == s.charAt(right)){
                left--;
                right++;
            }
            int len = right - left + 1;
            if(len > maxLen){
                maxLen = len;
                ans = s.substring(left+1, right);
            }

            //even length
            if(i+1<n && s.charAt(i) == s.charAt(i+1)){
                left = i-1;
                right = i + 2;
                while(left>=0 && right<n && s.charAt(left) == s.charAt(right)){
                    left--;
                    right++;
                }
            }
            len = right - left + 1;
            if(len > maxLen){
                maxLen = len;
                ans = s.substring(left+1, right);
            }
        }

        return ans;
    }
}