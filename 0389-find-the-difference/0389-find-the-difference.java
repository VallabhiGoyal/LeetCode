class Solution {
    public char findTheDifference(String s, String t) {
        int[] ch = new int[26];
        for(int i = 0; i<s.length(); i++){
            ch[s.charAt(i)-'a']++;
        }
        for(int i = 0; i<t.length(); i++){
            ch[t.charAt(i)-'a']--;
        }
        int i = 0;
        for(i = 0; i<26; i++){
            if(ch[i] == -1) break;
        }

        return (char)(i+'a');
    }
}