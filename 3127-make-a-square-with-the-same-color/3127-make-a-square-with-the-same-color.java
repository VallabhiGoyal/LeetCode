class Solution {
    public boolean canMakeSquare(char[][] grid) {
        for(int i = 0; i<2; i++){
            for(int j = 0; j<2; j++){
                if(grid[i][j] == grid[i+1][j]){
                    if(grid[i][j] == grid[i][j+1] || grid[i][j] == grid[i+1][j+1]) return true;
                    if(grid[i+1][j] == grid[i][j+1] || grid[i+1][j] == grid[i+1][j+1]) return true;
                }else{
                    if(grid[i][j] == grid[i][j+1] && grid[i][j] == grid[i+1][j+1]) return true;
                    if(grid[i+1][j] == grid[i][j+1] && grid[i+1][j] == grid[i+1][j+1]) return true;
                }
            }
        }

        return false;
    }
}