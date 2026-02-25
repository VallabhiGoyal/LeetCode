class Solution {
    public int countElements(int[] nums) {
        int n = nums.length;
        if(n<3) return 0;
        Arrays.sort(nums);
        
        int i = 1;
        while(i<n){
            if(nums[i] == nums[0]) i++;
            else break;
        }
        int k = n-2;
        while(k>=0){
            if(nums[k] == nums[n-1]) k--;
            else break;
        }
        if(i == n || k==-1) return 0;
        return k-i+1;
    }
}