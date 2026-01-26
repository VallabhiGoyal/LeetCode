class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        List<List<Integer>> list = new ArrayList<>();
        if(arr.length == 0) return list;

        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;
        for(int i = arr.length-1; i>0; i--){
            minDiff = Math.min(minDiff, arr[i]-arr[i-1]);
        }

        for(int i = 0; i<arr.length-1; i++){
            if(Math.abs(arr[i] - arr[i+1]) == minDiff){
                List<Integer> subList = new ArrayList<>();
                subList.add(arr[i]);
                subList.add(arr[i+1]);
                list.add(subList);
            }
        }

        return list;
    }
}