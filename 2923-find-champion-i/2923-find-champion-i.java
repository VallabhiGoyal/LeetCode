class Solution {
    public int findChampion(int[][] grid) {
        int a = grid.length;
        int b = grid[0].length;

        int[] row = new int[a];

        for(int i = 0; i<a; i++){
            for(int j = 0; j<b; j++){
                row[i] += grid[i][j];
            }
        }

        int maxIdx = 0;
        int max = 0;
        for(int i = 0; i<a; i++){
            if(max<row[i]){
                max = row[i];
                maxIdx = i;
            }
        }

        return maxIdx;
    }
}