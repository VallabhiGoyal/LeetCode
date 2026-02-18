class Solution {
    public int pivotIndex(int[] arr) {
        int n = arr.length;
        if(n==0) return -1;
        if(n==1) return 0;
        if(n == 2){
            if(arr[1] == 0) return 0;
            if(arr[0] == 0) return 1;
            return -1;
        }
        int leftSum = 0;
        int rightSum = 0;

        int j = n-1;
        int i = 0;
        if(arr[i]>arr[j]){
            rightSum += arr[j];
            j--;
        }else{
            leftSum+= arr[i];
            i++;
        }
        
        while(i<=j){
            if(i == j){
                if(leftSum == rightSum) return i;
                return -1;
            }

            if(leftSum < rightSum){
                leftSum += arr[i];
                i++; 
            }else if(rightSum < leftSum){
                rightSum += arr[j];
                j--;
            }else{
                rightSum += arr[j];
                j--;
                leftSum+= arr[i];
                i++;
            }
        }

        if(leftSum != rightSum) return -1;
        return i;
    }
}