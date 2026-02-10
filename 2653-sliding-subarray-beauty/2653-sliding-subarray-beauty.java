class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        getSubarray(list, nums, k, x);
        int[] arr = new int[list.size()];
        for(int i = 0; i<list.size(); i++){
            arr[i] = list.get(i);
        }

        return arr;
    }

    private void getSubarray(List<Integer> list, int[] nums, int k, int x){
        int[] freq = new int[51];
        int n = nums.length;

        for(int i = 0; i<n; i++){
            if(nums[i] < 0){
                freq[Math.abs(nums[i])]++;
            }

            if (i >= k && nums[i - k] < 0) {
                freq[-nums[i - k]]--;
            }

            if(i>=k-1){
                int count = 0;
                int beauty = 0;
                for(int j = 50; j>=1; j--){
                    count += freq[j];
                    if(count>=x){
                        beauty = -j;
                        break;
                    }
                }
                list.add(beauty);
            }
        }

        
    }
}