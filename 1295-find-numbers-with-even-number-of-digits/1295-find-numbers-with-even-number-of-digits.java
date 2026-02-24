class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        String[] arr = new String[n];
        int count = 0;
        for(int i = 0; i<n; i++){
            arr[i] = Integer.toString(nums[i]);
            if(arr[i].length() % 2 == 0) count++;
        }

        return count;
    }
}