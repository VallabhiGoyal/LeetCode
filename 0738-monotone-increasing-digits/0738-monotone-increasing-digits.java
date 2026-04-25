class Solution {
    public int monotoneIncreasingDigits(int n) {

        int[] digit = new int[10];
        for(int i = 9; i >=0; i--){
            digit[i] = n%10;
            n/=10;
        }

        int mark = 10;
        for(int i = 9; i > 0; i--){
            if(digit[i] < digit[i - 1]){
                digit[i - 1]--;
                mark = i;
            }
        }

        for(int i = mark; i < 10; i++){
            digit[i] = 9;
        }

        int ans = 0;
        for(int i = 0; i < 10; i++){
            ans = ans * 10 + digit[i];
        }

        return ans;
    }
}