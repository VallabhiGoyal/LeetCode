class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = new String();

        for(int i = 0; i<strs[0].length(); i++){
            char ch = strs[0].charAt(i);
            for(int j = 0 ; j<strs.length; j++){
                if(strs[j].charAt(i) != ch){
                    return ans;
                }
            }
            ans+=ch;
        }

        return ans;
    }
}