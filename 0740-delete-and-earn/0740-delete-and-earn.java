class Solution {
    public int deleteAndEarn(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        int max = nums[0];
        for(int i = 0; i<n; i++){
            max = Math.max(nums[i], max);
            map.put(nums[i], map.getOrDefault(nums[i], 0) + nums[i]);
        }
        
        int m = max;
        int[] points = new int[m+1];

        for(int key : map.keySet()){
            points[key] = map.get(key);
        }

        int[] t = new int[m+1];

        t[0] = points[0];
        t[1] = Math.max(points[0], points[1]);

        for(int i = 2; i<m+1; i++){
            t[i] = Math.max(points[i] + t[i-2], t[i-1]);
        }

        return t[m];
    }
}