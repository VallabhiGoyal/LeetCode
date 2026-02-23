class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int a = str1.length();
        int b = str2.length();

        for(int i = b; i>0; i--){
            String ch = str2.substring(0,i);
            if(a % i != 0) continue;
            int j = 0;
            int count = 0;
            for(j = 0; j<a; j = j + i){
                String ch1 = str1.substring(j,j+i);
                if(!ch1.equals(ch)) break;
                count++;
            }
            if(j==a && count == a/i) return ch;
        }

        return new String("");
    }
}