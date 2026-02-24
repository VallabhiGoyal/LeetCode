class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;

        int count = 0;
        for(int i = 0; i<n; i++){
            String ch  = Integer.toString(nums[i]);
            if(ch.length() % 2 == 0) count++;
        }

        return count;
    }
}