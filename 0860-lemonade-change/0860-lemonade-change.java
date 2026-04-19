class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n = bills.length;

        int five = 0;
        int ten = 0;
        int twenty = 0;

        for(int i = 0; i<n; i++){
            if(bills[i] == 5) five++;
            else if(bills[i] == 10){
                ten++;
                if(five == 0) return false;
                five--;
            }else{
                twenty++;
                if(five < 3 && ten == 0) return false;
                if(ten >= 1){
                    ten--;
                    if(five == 0) return false;
                    five--;
                }
                else if (five >= 3) five-=3;
            }
        }

        return true;
    }
}