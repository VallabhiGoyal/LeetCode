class Solution {
    public int mySqrt(int x) {
        if(x == 0) return 0;
        if(x == 1) return 1;

        int low = 1;
        int high = x/2;
        int n = 0;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(mid == x/mid){
                return mid;
            }else if(mid > x/mid){
                high = mid - 1;
            }else{
                low = mid + 1;
                n = mid;
            }
        }

        return n;
        
    }
}