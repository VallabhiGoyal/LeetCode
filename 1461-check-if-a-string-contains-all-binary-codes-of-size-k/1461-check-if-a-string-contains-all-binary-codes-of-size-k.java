class Solution {
    public boolean hasAllCodes(String s, int k) {
        if(s.length()<k) return false;
        Set<Integer> set = new HashSet<>();
        int total = 1 << k;

        int curr = 0;
        for(int i =0; i<k; i++){
            curr = (curr << 1) | (s.charAt(i) - '0');
        }
        set.add(curr);

        int mask = total - 1;
        for(int i = 1; i<s.length()-k+1; i++){
            curr = ((curr<<1)&mask) | (s.charAt(i+k-1) - '0');
            set.add(curr);
            if(set.size() == total) return true;
        }
        return false;
    }
}