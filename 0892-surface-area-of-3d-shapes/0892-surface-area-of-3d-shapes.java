class Solution {
    public int surfaceArea(int[][] grid) {
        int n = grid.length;

        int area = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                int height = grid[i][j];
                if(height > 0){
                    area += 2;
                }

                if(i>0){
                    if(grid[i-1][j] < grid[i][j]){
                        area += (height - grid[i-1][j]);
                    }
                }else{
                    area += height;
                }

                if(i<n-1){
                    if(grid[i+1][j] < grid[i][j]){
                        area += (height - grid[i+1][j]);
                    }
                }else{
                    area += height;
                }

                if(j>0){
                    if(grid[i][j-1] < grid[i][j]){
                        area += (height - grid[i][j-1]);
                    }
                }else{
                    area += height;
                }

                if(j<n-1){
                    if(grid[i][j+1] < grid[i][j]){
                        area += (height - grid[i][j+1]);
                    }
                }else{
                    area += height;
                }
            }
        }

        return area;
    }
}