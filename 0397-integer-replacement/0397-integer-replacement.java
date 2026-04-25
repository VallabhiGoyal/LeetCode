class Solution {
    public int integerReplacement(int n) {
        if(n == 1) return 0;
        long num = n;
        int count = 0;
        while(num != 1){
            if((num & 1)  == 0){
                num = num>>1;
            }else{
               if(num == 3 || (num & 3) == 1) num-- ;
               else num++; 
            }
            count++;
        }

        return count;
    }
}