class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;

        for (int i = n/2 - 1; i >= 0; i--) {
            downHeap(nums, i, n);
        }

        for (int end = n - 1; end > 0; end--) {
            int temp = nums[0];
            nums[0] = nums[end];
            nums[end] = temp;     
            downHeap(nums, 0, end); 
        }

        return nums;
    }


    private void downHeap(int[] arr, int i, int heapSize){
        int largest = i;

        while(true){
            int left = 2*i + 1;
            int right = 2*i + 2;

            if(left<heapSize && arr[left]>arr[largest]){
                largest = left;
            }

            if(right<heapSize && arr[right]>arr[largest]){
                largest = right;
            }

            if(largest == i) break;

            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            i = largest;
        }
    }
}