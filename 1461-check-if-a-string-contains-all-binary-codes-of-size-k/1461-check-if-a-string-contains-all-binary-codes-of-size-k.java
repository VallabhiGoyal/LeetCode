class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> set = new HashSet<>();

        for(int i = 0; i<s.length()-k; i++){
            String curr = s.substring(i, i+k);
            set.add(curr);
        }

        int total = (int)Math.pow(2,k);
        if(set.size() == total) return true;
        return false;
    }
}