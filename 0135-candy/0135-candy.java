class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;

        int[] temp = new int[n];
        for(int i = 0; i<n; i++){
            temp[i] = 1;
        }

        for(int i = 0; i<n; i++){
            boolean incr = false;
            if(i>0 && ratings[i] > ratings[i-1]){
                if(temp[i-1] >= temp[i]) temp[i] = temp[i-1]+1;
                incr = true;
            }
            if(i<n-1 && ratings[i] > ratings[i+1]){
                if(temp[i+1] >= temp[i]) temp[i] = temp[i+1]+1;
                incr = true;
            }
        }

        for(int i = n-1; i>=0; i--){
            boolean incr = false;
            if(i>0 && ratings[i] > ratings[i-1]){
                if(temp[i-1] >= temp[i]) temp[i] = temp[i-1]+1;
                incr = true;
            }
            if(i<n-1 && ratings[i] > ratings[i+1]){
                if(temp[i+1] >= temp[i]) temp[i] = temp[i+1]+1;
                incr = true;
            }
        }

        int ans = 0;
        for(int i = 0; i<n; i++){
            ans += temp[i];
        }

        return ans;
    }
}