class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;

        int i = 0;
        int start = 0;
        while(i<n-1){
            if(nums[i]<nums[i+1]){
                i++;
            }else{
                break;
            }
        }
        if(i==start) return false;

        start=i;
        while(i<n-1){
            if(nums[i]>nums[i+1]){
                i++;
            }else{
                break;
            }
        }
        if(i==start) return false;

        start=i;
        while(i<n-1){
            if(nums[i]<nums[i+1]){
                i++;
            }else{
                break;
            }
        }
        if(i==start) return false;

        if(i == n-1) return true;
        else return false;

    }
}