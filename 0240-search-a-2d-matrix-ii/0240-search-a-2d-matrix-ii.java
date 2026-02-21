class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int a = matrix.length;
        int b = matrix[0].length;

        int colIdx = -1;
        
        for(int j = 0; j<b-1; j++){
            if(matrix[0][j] == target) return true;
            if(matrix[0][j]<target && matrix[0][j+1]>target){
                colIdx = j;
                break;
            }
        }
        
        if(colIdx == -1 && matrix[0][b-1]<=target) colIdx = b-1;

        if(colIdx == -1) return false;

        int rowIdx = -1;
        for(int i = 0; i<a-1; i++){
            if(matrix[i][0] == target) return true;
            if(matrix[i][0]<target && matrix[i+1][0]>target){
                rowIdx = i;
                break;
            }
        }

        if(rowIdx == -1 && matrix[a-1][0]<=target) rowIdx = a-1;

        if(rowIdx == -1) return false;

        for(int i = 0; i<=rowIdx; i++){
            for(int j = 0; j<=colIdx; j++){
                if(matrix[i][j] == target) return true;
            }
        }

        return false;

    }
}