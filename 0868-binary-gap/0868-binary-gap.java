class Solution {
    public int binaryGap(int n) {
        String binary = Integer.toBinaryString(n);
        int maxDiff = 0;
        int preIdx = -1;
        for(int i = 0; i<binary.length(); i++){
            char ch = binary.charAt(i);
            if(ch == '1'){
                if(preIdx != -1){
                    maxDiff = Math.max(maxDiff, i-preIdx);
                }
                preIdx = i;
            }
        }

        return maxDiff;
    }
}