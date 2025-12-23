class Solution {

    List<int[]>[] graph;

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        createGraph(flights, n);
        int ans = DijkstraAlgo(src, dst, k, n);
        return ans == Integer.MAX_VALUE ? -1: ans;
    }

    public int DijkstraAlgo(int src, int dest, int k, int n){
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0, 0));

        int[][] dist = new int[n][k+2];

        for(int i = 0; i<n; i++){
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }
        
        dist[src][0] = 0;

        while(!pq.isEmpty()){

            Pair curr = pq.remove();
            int node = curr.node;
            int currCost = curr.cost;
            int stops = curr.stops;
            
            if (node == dest) return currCost;
            if (stops > k) continue;

            for(int[] edge : graph[node]){

                int neigh = edge[0];
                int wt = edge[1];

                int newCost = currCost + wt;

                if(newCost < dist[neigh][stops+1]){ // relaxation
                    dist[neigh][stops+1] = newCost;
                    pq.add(new Pair(neigh, newCost, stops+1));
                }
            }
            
        }

        return Integer.MAX_VALUE;
    }

    public void createGraph(int[][] flights, int n){
        graph = new ArrayList[n];

        for(int i = 0; i<n; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i<flights.length; i++){
            int src = flights[i][0];
            int dest = flights[i][1];
            int cost = flights[i][2];

            graph[src].add(new int[]{dest,cost});
        }
    }

    public static class Pair implements Comparable<Pair>{
        int node;
        int cost;
        int stops;

        public Pair(int node, int cost, int stops){
            this.node = node;
            this.cost = cost;
            this.stops = stops;
        }
        @Override
        public int compareTo(Pair other){
            return this.cost - other.cost;
        }

    }
}