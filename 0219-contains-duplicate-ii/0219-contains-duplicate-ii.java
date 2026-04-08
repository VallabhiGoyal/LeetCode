class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;

        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < Math.min(k + 1, n); i++){
            if(set.contains(nums[i])) return true;
            set.add(nums[i]);
        }
        
        int j = 0;
        for(int i = k + 1; i < n; i++){
            set.remove(nums[j++]);
            if(set.contains(nums[i])) return true;
            set.add(nums[i]);
        }

        return false;
    }
}