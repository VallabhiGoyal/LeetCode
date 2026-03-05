class Solution {
    public int minOperations(String s) {
        int n = s.length(); 
        if( n == 1) return 0;

        int even0 = 0;
        int even1 = 0;
        int odd0 = 0;
        int odd1 = 0;

        //even 0 odd 1 ---> 01
        for(int i = 0; i<s.length(); i = i + 2){
            char ch = s.charAt(i);
            if(ch == '0') even0++;
            else odd1++;
        }

        //odd 0 even 1 ---> 10
        for(int i = 1; i<s.length(); i = i+ 2){
            char ch = s.charAt(i);
            if(ch == '0') odd0++;
            else even1++;
        }

        return n - Math.max(even0+even1, odd0 + odd1);
    }
}