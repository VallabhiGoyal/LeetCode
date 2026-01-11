class Solution {
    public int maximalRectangle(char[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] heights = new int[cols];

        int maxArea = 0;
        for(int i = 0; i<rows; i++){
            Stack<Integer> stack = new Stack<>();
            for(int j = 0; j<cols; j++){
                if(matrix[i][j] == '1'){
                    heights[j]++;
                    if(stack.isEmpty() || heights[j]>heights[stack.peek()]){
                        stack.push(j);
                    }else{
                        int poppedIndex = 0;
                        while(!stack.isEmpty() && heights[j]<=heights[stack.peek()]){
                            poppedIndex = stack.pop();
                            int height = heights[poppedIndex];
                            int width = stack.isEmpty()? j : j - stack.peek() - 1;
                            maxArea = Math.max(maxArea, width*height);

                        }
                        stack.push(j);
                    }
                }else{
                    heights[j] = 0;
                    while(!stack.isEmpty()){
                        int poppedIndex = stack.pop();
                        int height = heights[poppedIndex];
                        int width = stack.isEmpty()? j : j - stack.peek() - 1;
                        maxArea = Math.max(maxArea, width*height);
                    }
                }
            }
            while(!stack.isEmpty()){
                int poppedIndex = stack.pop();
                int height = heights[poppedIndex];
                int width = stack.isEmpty()? cols : cols - stack.peek() - 1;
                maxArea = Math.max(maxArea, width*height);
            }
            
        }

        return maxArea;
    }
}