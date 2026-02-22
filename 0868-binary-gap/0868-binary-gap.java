class Solution {
    public int binaryGap(int n) {
        int temp  = n;
        String binary = Integer.toBinaryString(n);
        int diff = 0;
        for(int i = 0; i<binary.length(); i++){
            char ch = binary.charAt(i);
            if(ch == '1'){
                int j = i;
                for(j  = i+1; j<binary.length(); j++){
                    if(binary.charAt(j) == '1'){
                        diff = j-i;
                        break;
                    }
                }
                i = j;
            }
        }

        return diff;
    }
}