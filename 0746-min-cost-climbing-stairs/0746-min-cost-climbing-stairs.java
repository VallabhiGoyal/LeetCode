class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        int[] t = new int[n];

        int cost1 = cost[0];
        int cost2 = cost[1];

        for(int i = 2; i<n; i++){
            int curr = cost[i] + Math.min(cost1, cost2);
            cost1 = cost2;
            cost2 = curr;
        }

        return Math.min(cost1, cost2);
    }
}