class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        int len = 1<<n;
        int[] freq = new int[len];

        for(int i = 0; i<n; i++){
            int decimal = Integer.parseInt(nums[i], 2);
            freq[decimal]++;
        }

        for(int i = len-1; i>=0; i--){
            if(freq[i] == 0){
                String str = Integer.toBinaryString(i);
                while(str.length()!=n){
                    str = "0" + str;
                }
                return str;
            }
        }

        return "";
    }
}