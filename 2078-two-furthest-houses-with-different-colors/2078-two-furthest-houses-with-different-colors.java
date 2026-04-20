class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;

        int max = 0;

        int j = n-1;
        for(int i = 0; i<n; i++){
            while(colors[i] == colors[j]){
                j--;
            }
            max = Math.max(max, j-i);
            j = n-1;
        }

        return max;
    }
}