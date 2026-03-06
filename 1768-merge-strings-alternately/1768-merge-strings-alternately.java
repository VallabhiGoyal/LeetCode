class Solution {
    public String mergeAlternately(String word1, String word2) {
        int a = word1.length();
        int b = word2.length();

        int i = 0;
        int j = 0;

        StringBuilder str = new StringBuilder();
        while(i<a && j<b){
            str.append(word1.charAt(i++));
            str.append(word2.charAt(j++));
        }

        if(i!=a) str.append(word1.substring(i));
        else if(j!=b) str.append(word2.substring(j));

        return str.toString();
    }
}