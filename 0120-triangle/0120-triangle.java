class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();

        for(int i = 1; i<n; i++){
            int value = triangle.get(i).get(0) + triangle.get(i-1).get(0);
            triangle.get(i).set(0, value);
        }

        for(int i = 1; i<n; i++){
            List<Integer> list = triangle.get(i);
            for(int j = 1; j<list.size(); j++){
                int value;
                if(j != list.size()-1){
                    value = list.get(j) + Math.min(triangle.get(i-1).get(j), triangle.get(i-1).get(j-1));
                }else{
                    value = list.get(j) + triangle.get(i-1).get(j-1);
                }

                list.set(j, value);
            }
        }

        int min = Integer.MAX_VALUE;
        List<Integer> list = triangle.get(n-1);
        for(int i = 0; i<list.size(); i++){
            if(min > list.get(i)) min = list.get(i);
        }

        return min;
    }
}