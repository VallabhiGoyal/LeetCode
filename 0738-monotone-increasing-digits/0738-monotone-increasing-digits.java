class Solution {
    public int monotoneIncreasingDigits(int n) {
        char[] digit = String.valueOf(n).toCharArray();

        int m = digit.length;
        
        int mark = m;
        for(int i = m-1; i>0; i--){
            if(digit[i] < digit[i-1]){
                digit[i-1]--;
                mark = i;
            }
        }

        for(int i = mark; i<m; i++){
            digit[i] = '9';
        }
        System.out.println(Arrays.toString(digit));

        int ans = 0;
        for(int i = 0; i<m; i++){
            ans = ans*10 + (digit[i]-'0');
        }

        return ans;
    }
}