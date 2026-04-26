class Solution {
    public boolean containsCycle(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(!visited[i][j]){
                    if(dfs(grid, visited, i, j, -1, -1)) return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(char[][] grid, boolean[][] visited, int row, int col, int parentRow, int parentCol){
        int m = grid.length;
        int n = grid[0].length;

        visited[row][col] = true;

        if(row-1 >= 0 && grid[row][col] == grid[row-1][col]){
            if(!visited[row-1][col]){
                if(dfs(grid, visited, row-1, col, row, col)) return true;
            }           
            else if(!(row-1 == parentRow && col == parentCol)) return true;
        }

        if(col-1 >= 0 && grid[row][col] == grid[row][col-1]){
            if(!visited[row][col-1]){
                if(dfs(grid, visited, row, col-1, row, col)) return true;
            }           
            else if(!(row == parentRow && col-1 == parentCol)) return true;
        }

        if(row+1 < m && grid[row][col] == grid[row+1][col]){
            if(!visited[row+1][col]){
                if(dfs(grid, visited, row+1, col, row, col)) return true;
            }           
            else if(!(row+1 == parentRow && col == parentCol)) return true;
        }

        if(col + 1 < n && grid[row][col] == grid[row][col+1]){
            if(!visited[row][col+1]){
                if(dfs(grid, visited, row, col+1, row, col)) return true;
            }           
            else if(!(row == parentRow && col+1 == parentCol)) return true;
        }

        return false;
    }
}