class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> sMap = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            sMap.put(s.charAt(i),sMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i = 0; i<t.length(); i++){
            if(sMap.containsKey(t.charAt(i)) && sMap.get(t.charAt(i)) > 0){
                sMap.put(t.charAt(i), sMap.get(t.charAt(i)) - 1);
            }else{
                return false;
            }
        }

        return true;
    }
}