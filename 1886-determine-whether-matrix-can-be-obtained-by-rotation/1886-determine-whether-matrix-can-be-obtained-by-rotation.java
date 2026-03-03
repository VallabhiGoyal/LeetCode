class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        
        int count = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(mat[i][j] == target[i][j]) count++;
                else break;
            }
        }
        if(count == n*n) return true;

        int[][] answer = mat;
        for(int k = 1; k<4; k++){
            answer = rotate90(answer);
            count = 0;
            for(int i = 0; i<n; i++){
                for(int j = 0; j<n; j++){
                    if(answer[i][j] == target[i][j]) count++;
                    else break;
                }
            }
            if(count == n*n) return true;
        }

        return false;
    }

    private int[][] rotate90(int[][] arr){
        int a = arr.length;
        int b = arr[0].length;

        int[][] result = new int[b][a];

        //transpose
        for(int i = 0; i<b; i++){
            for(int j = 0; j<a; j++){
                result[i][j] = arr[j][i];
            }
        }

        //reverse
        for(int i =0; i<b; i++){
            for(int j = 0; j<a/2; j++){
                int temp = result[i][j];
                result[i][j] = result[i][a-j-1];
                result[i][a-j-1] = temp;
            }
        }

        return result;
    }
}