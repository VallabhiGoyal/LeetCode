class Solution {
    public String convertToBase7(int num) {
        if(num == 0) return "0";
        StringBuilder ch = new StringBuilder();
        int temp = Math.abs(num);
        while(temp>0){
            int rem = temp % 7;
            ch.append(rem);
            temp /= 7;
        }
        String answer = new StringBuilder(ch).reverse().toString();
        if(num<0) return "-" + answer;
        return answer;
    }
}