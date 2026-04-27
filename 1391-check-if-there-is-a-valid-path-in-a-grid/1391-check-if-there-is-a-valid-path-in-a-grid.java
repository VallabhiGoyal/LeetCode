class Solution {
    int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};

    public boolean hasValidPath(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];

        return helper(grid, visited, 0, 0, m, n);
    }

    private boolean helper(int[][] grid, boolean[][] visited, int i, int j, int m, int n){
        if(visited[i][j]) return false;
        if(i == m-1 && j == n-1) return true;

        visited[i][j] = true;

        int curr = grid[i][j];

        for(int d = 0; d < 4; d++){
            int ni = i + dirs[d][0];
            int nj = j + dirs[d][1];

            if(ni < 0 || nj < 0 || ni >= m || nj >= n) continue;
            if(visited[ni][nj]) continue;

            int next = grid[ni][nj];
            boolean valid = false;

            if(d == 0){
                if(curr == 2 || curr == 5 || curr == 6){
                    if(next == 2 || next == 3 || next == 4) valid = true;
                }
            }else if(d == 1){
                if(curr == 2 || curr == 3 || curr == 4){
                    if(next == 2 || next == 5 || next == 6) valid = true;
                }
            }else if(d == 2){
                if(curr == 1 || curr == 3 || curr == 5){
                    if(next == 1 || next == 4 || next == 6) valid = true;
                }
            }else{
                if(curr == 1 || curr == 4 || curr == 6){
                    if(next == 1 || next == 3 || next == 5) valid = true;
                }
            }

            if(valid){
                if(helper(grid, visited, ni, nj, m, n)) return true;
            }
        }

        return false;
    }
}