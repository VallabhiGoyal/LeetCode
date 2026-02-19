class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> rows = new ArrayList<>();
        List<Integer> cols = new ArrayList<>();

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(matrix[i][j] == 0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        for(int i = 0; i<rows.size(); i++){
            int row = rows.get(i);
            for(int j = 0; j<n; j++){
                matrix[row][j] = 0;
            }
        }

        for(int i = 0; i<cols.size(); i++){
            int col = cols.get(i);
            for(int j = 0; j<m; j++){
                matrix[j][col] = 0;
            }
        }
    }
}