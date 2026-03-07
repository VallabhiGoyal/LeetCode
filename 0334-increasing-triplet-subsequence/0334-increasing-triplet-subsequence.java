class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        if(n<3) return false;

        int first = nums[0];
        int second = Integer.MAX_VALUE;

        for(int i = 1; i<n; i++){
            if(first>=nums[i]) first = nums[i];
            else if(first<nums[i] && second>=nums[i]) second = nums[i];
            else if(nums[i] > second) return true;
        }
        return false;
    }
}