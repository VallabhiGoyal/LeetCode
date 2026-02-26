class Solution {
    public int[][] imageSmoother(int[][] img) {
        int a = img.length;
        int b = img[0].length;

        int[][] result = new int[a][b];
        for(int i = 0; i<a; i++){
            
            for(int j = 0; j<b; j++){
                int count = 1;
                //left
                if(j>0){
                    result[i][j] += img[i][j-1];
                    count++;
                    if(i>0){
                        result[i][j] += img[i-1][j-1];
                        count++;
                    }
                }
                //right
                if(j<b-1){
                    result[i][j] += img[i][j+1];
                    count++;
                    if(i<a-1){
                        result[i][j] += img[i+1][j+1];
                        count++;
                    }
                }
                //up 
                if(i>0){
                    result[i][j] += img[i-1][j];
                    count++;
                    if(j<b-1){
                        result[i][j] += img[i-1][j+1];
                        count++;
                    }
                }
                //down
                if(i<b-1){
                    result[i][j] += img[i+1][j];
                    count++;
                    if(j>0){
                        result[i][j] += img[i+1][j-1];
                        count++;
                    }
                }
                //average
                result[i][j] = (result[i][j] + img[i][j])/count;
            }
        }

        return result;
    }
}