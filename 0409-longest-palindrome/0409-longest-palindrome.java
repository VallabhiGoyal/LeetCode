class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();

        int[] freq = new int[128];

        for(int i = 0; i<n; i++){
            int ch = s.charAt(i) - 'A';
            freq[ch]++;
        }

        int len = 0;
        int odd = 0;

        for(int i = 0; i<128; i++){
            if(freq[i] % 2 == 0) len += freq[i];
            else{
                len += freq[i]-1;
                odd = 1;
            }
        }

        if(odd == 1) return ++len;
        return len;
    }
}