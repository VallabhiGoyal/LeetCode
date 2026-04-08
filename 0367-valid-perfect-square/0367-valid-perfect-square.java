class Solution {
    public boolean isPerfectSquare(int num) {
        long sq = (long)Math.sqrt(num);
        if(sq*sq == num) return true;

        return false;
    }
}