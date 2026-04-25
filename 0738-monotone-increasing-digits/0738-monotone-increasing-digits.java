class Solution {
    public int monotoneIncreasingDigits(int n) {
        int[] digit = new int[10];

        for(int i = 9; i>=0; i--){
            digit[i] = n % 10;
            n /= 10;
        }
        
        for(int i = 0; i<9; i++){
            if(digit[i] > digit[i+1]){
                digit[i]--;
                for(int j = i+1; j<10; j++){
                    digit[j] = 9;
                }
                i = -1;
            }
        }

        int ans = 0;
        for(int i = 0; i<10; i++){
            ans = ans*10 + digit[i];
        }

        return ans;
    }
}