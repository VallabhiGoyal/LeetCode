class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums1.length; i++){
            map.put(nums1[i], i);
        } 

        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<nums2.length; i++){
            set.add(nums2[i]);
        }

        for(int n : set){
            if(map.containsKey(n)) list.add(n);
        }

        int size = list.size();
        int[] ans = new int[size];
        for(int i = 0; i<size; i++){
            ans[i] = list.get(i);
        }

        return ans;
    }
}