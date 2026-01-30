class Solution {
    public int addDigits(int num) {
        return add(num);

    }

    public int add(int num){
        int result = 0;
        while(num>0){
            int temp = num%10;
            result += temp;
            num /= 10;
        }
        if(result > 9){
            result = add(result);
        }

        return result;
    }
}