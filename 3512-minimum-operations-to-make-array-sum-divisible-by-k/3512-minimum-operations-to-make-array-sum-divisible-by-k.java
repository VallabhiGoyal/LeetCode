class Solution {
    public int minOperations(int[] nums, int k) {
        int max_sum = 0;
        for(int i = 0; i<nums.length; i++){
            max_sum += nums[i];
        }
        int remain = max_sum % k;

        return remain;
    }
}