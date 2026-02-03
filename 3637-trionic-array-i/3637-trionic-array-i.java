class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;

        int i = 0;
        int j = 0;
        while(i<n-1){
            if(nums[i]<nums[i+1]){
                i++;
            }else{
                break;
            }
        }
        if(i==j) return false;

        j=i;
        while(i<n-1){
            if(nums[i]>nums[i+1]){
                i++;
            }else{
                break;
            }
        }
        if(i==j) return false;

        j=i;
        while(i<n-1){
            if(nums[i]<nums[i+1]){
                i++;
            }else{
                break;
            }
        }
        if(i==j) return false;

        if(i == n-1) return true;
        else return false;

    }
}