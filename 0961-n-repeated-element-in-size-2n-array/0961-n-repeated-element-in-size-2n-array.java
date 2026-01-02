class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();

        for(int num : nums){
            int value = freq.getOrDefault(num, 0) + 1;
            freq.put(num, value);
            if(value >=2){
                return num;
            }
        }
        return -1;
    }
}