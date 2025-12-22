class Solution {

    ArrayList<Integer> graph[];

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        createGraph(numCourses, prerequisites);
        boolean[] visit = new boolean[numCourses];
        boolean[] rec = new boolean[numCourses];

        for(int i = 0; i<numCourses; i++){
            if(!visit[i]){
                if(isCyclic(visit, i, rec)) return false;
            }
        }

        return true;
    }

    private boolean isCyclic(boolean visit[], int curr, boolean rec[]){
        visit[curr] = true;
        rec[curr] = true;
        
        for(int i = 0; i<graph[curr].size(); i++){
            int edge = graph[curr].get(i);

            if(rec[edge]){
                return true;
            }else if(!visit[edge]){
                if(isCyclic(visit, edge, rec)){
                    return true;
                }
            }
        }

        rec[curr] = false;
        return false;
    }

    private void createGraph(int numCourses, int[][] pre){
        graph = new ArrayList[numCourses];

        for(int i = 0; i<numCourses; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i<pre.length; i++){
            graph[pre[i][1]].add(pre[i][0]);
        }
    }

}