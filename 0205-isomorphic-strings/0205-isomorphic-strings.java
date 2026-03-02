class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();

        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for(int i = 0; i<n; i++){
            if(mapS[s.charAt(i)] != mapT[t.charAt(i)]) return false;
            mapS[s.charAt(i)]++;
            mapT[t.charAt(i)]++;
        }

        return true;
    }

}