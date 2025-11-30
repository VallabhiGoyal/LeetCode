class Solution {
    public int minOperations(int[] nums, int k) {
        int max_sum = 0;
        for(int i = 0; i<nums.length; i++){
            max_sum += nums[i];
        }
        return max_sum % k;
    }
}