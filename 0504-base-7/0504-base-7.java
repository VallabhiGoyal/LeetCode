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
        
        if(num<0) ch.append("-");
        return ch.reverse().toString();
    }
}