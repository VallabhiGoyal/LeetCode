class Solution {
    public int deleteAndEarn(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

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

        int t1 = points[0];
        int t2 = Math.max(points[0], points[1]);

        for(int i = 2; i<m+1; i++){
            int curr = Math.max(points[i] + t1, t2);
            t1 = t2;
            t2 = curr;
        }

        return t2;
    }
}