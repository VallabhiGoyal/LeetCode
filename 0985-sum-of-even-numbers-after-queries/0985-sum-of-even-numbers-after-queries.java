class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int n = nums.length;

        int p = queries.length;
        int[] answer  = new int[p];
        int k = 0;

        int sumEven = 0;
        for(int i = 0; i<n; i++){
            if(nums[i]%2==0){
                sumEven+=nums[i];
            }
        }

        for(int i = 0; i<p; i++){
            int index = queries[i][1];
            if(nums[index]%2==0){
                sumEven -= nums[index];
            }
            int temp2 =  queries[i][0];
            nums[index] += queries[i][0];
            if(nums[index] % 2 ==0){
                sumEven += nums[index];
            }
            answer[k++] = sumEven;
        }

        return answer;
    }
}