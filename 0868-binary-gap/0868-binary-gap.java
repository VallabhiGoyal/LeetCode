class Solution {
    public int binaryGap(int n) {
        int temp  = n;
        String binary = Integer.toBinaryString(n);
        int maxDiff = 0;
        int preIdx = -1;
        int gap  = 0;
        for(int i = 0; i<binary.length(); i++){
            char ch = binary.charAt(i);
            if(ch == '1' && preIdx == -1) preIdx = i;
            else if(ch == '1'){
                gap = i - preIdx;
                preIdx = i;
                if(gap>maxDiff) maxDiff = gap;
            }
        }

        return maxDiff;
    }
}