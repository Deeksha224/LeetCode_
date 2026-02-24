class Solution {
    static boolean[] vis;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj =  new ArrayList<>();
        for(int i=0 ; i<n ; i++){
            adj.add(new ArrayList<>());
        }
        vis = new boolean[n];
        for(int[] edge : edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        return dfs(adj,source,destination);
    }
    public boolean dfs(List<List<Integer>> adj,int src,int des){
        if(src==des) return true;
        if(vis[src]) return false;
        vis[src] = true;
        for(int nbr : adj.get(src)){
            if(!vis[nbr]){
                if(dfs(adj,nbr,des)) return true;
            }
        }
        return false;
    }
}