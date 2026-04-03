class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];

        int[] t = new int[n];

        int t0 = nums[0];
        int t1 = Math.max(nums[0], nums[1]);
        for(int i = 2; i<n-1; i++){
            int curr = Math.max(nums[i] + t0, t1);
            t0 = t1;
            t1 = curr;
        }
        if(n<3) return t1;
        int t3 = nums[1];
        int t4 = Math.max(nums[1], nums[2]);
        for(int i = 3; i<n; i++){
            int curr = Math.max(nums[i] + t3, t4);
            t3 = t4;
            t4 = curr;
        }

        return Math.max(t1, t4);
    }
}