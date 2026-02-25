class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int a = matrix.length;
        int b = matrix[0].length;

        int[] rowMin = new int[a];
        for(int i = 0; i<a; i++){
            int min = matrix[i][0];
            int minIdx = 0;
            for(int j = 0; j<b; j++){
                if(min>matrix[i][j]){
                    min = matrix[i][j];
                    minIdx = j;
                }
            }
            rowMin[i] = minIdx;
        }

        int[] colMax = new int[b];
        for(int i = 0; i<b; i++){
            int max = matrix[0][i];
            int maxIdx = 0;
            for(int j = 0; j<a; j++){
                if(max<matrix[j][i]){
                    max = matrix[j][i];
                    maxIdx = j;
                }
            }
            colMax[i] = maxIdx;
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            int col = rowMin[i];
            if (colMax[col] == i) {
            list.add(matrix[i][col]);
        }
}

        return list;
    }
}