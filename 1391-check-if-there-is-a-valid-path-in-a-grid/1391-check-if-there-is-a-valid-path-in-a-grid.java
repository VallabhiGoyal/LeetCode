class Solution {
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
        if(i-1 >= 0){
            int next = grid[i-1][j];

            boolean valid = false;

            if(curr == 2 || curr == 5 || curr == 6){
                if(next == 2 || next == 3 || next == 4){
                    valid = true;
                }
            }

            if(valid && !visited[i-1][j]){
                if(helper(grid, visited, i-1, j, m, n)) return true;
            }
        }
        if(i+1 < m){
            int next = grid[i+1][j];

            boolean valid = false;

            if(curr == 2 || curr == 3 || curr == 4){
                if(next == 2 || next == 5 || next == 6){
                    valid = true;
                }
            }

            if(valid && !visited[i+1][j]){
                if(helper(grid, visited, i+1, j, m, n)) return true;
            }
        }
        if(j-1 >= 0){
            int next = grid[i][j-1];

            boolean valid = false;

            if(curr == 1 || curr == 3 || curr == 5){
                if(next == 1 || next == 4 || next == 6){
                    valid = true;
                }
            }

            if(valid && !visited[i][j-1]){
                if(helper(grid, visited, i, j-1, m, n)) return true;
            }
        }
        if(j+1 < n){
            int next = grid[i][j+1];

            boolean valid = false;

            if(curr == 1 || curr == 4 || curr == 6){
                if(next == 1 || next == 3 || next == 5){
                    valid = true;
                }
            }

            if(valid && !visited[i][j+1]){
                if(helper(grid, visited, i, j+1, m, n)) return true;
            }
        }

        return false;
    }
}