class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] answer = new int[n];
        int product = 1;
        int countZ = 0;
        for(int i = 0; i<n; i++){
            if(nums[i] == 0){
                countZ++;
                continue;
            }
            product *= nums[i];
        }

        if(countZ == n) return nums;

        for(int i = 0; i<n; i++){
            if(countZ > 0){
                if(nums[i]!=0){
                    answer[i] = 0;
                    continue;
                }else{
                    if(countZ>1){
                         answer[i] = 0;
                        continue;
                    }
                }
            }
            if(nums[i] == 0){
                answer[i] = product;
                continue;
            }
            answer[i] = product/nums[i];
        }

        return answer;

    }
}