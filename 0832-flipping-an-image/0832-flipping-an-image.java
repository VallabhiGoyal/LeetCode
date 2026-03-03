class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int a = image.length;
        int b = image[0].length;

        for(int i = 0; i<a; i++){
            for(int j = 0; j<b/2; j++){
                int temp = image[i][j];
                image[i][j] = image[i][b-j-1];
                image[i][b-j-1] = temp;

                if(image[i][j] == 0) image[i][j] = 1;
                else image[i][j] = 0;

                if(image[i][b-j-1] == 0) image[i][b-j-1] = 1;
                else image[i][b-j-1] = 0;
            }
            if(b%2==1){
                if(image[i][b/2] == 1) image[i][b/2] = 0;
                else image[i][b/2] = 1;
            }
        }

        return image;
    }
}