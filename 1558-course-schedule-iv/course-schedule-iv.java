import java.util.*;

class Solution {
    boolean[] vis;

    public List<Boolean> checkIfPrerequisite(int n, int[][] edges, int[][] queries) {
        List<Boolean> ans = new ArrayList<>();

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]); 
        }

        for (int i = 0; i < queries.length; i++) {
            int src = queries[i][0];
            int des = queries[i][1];

            vis = new boolean[n];
            ans.add(dfs(adj, src, des));
        }
        return ans;
    }

    public boolean dfs(List<List<Integer>> adj, int src, int des) {
        if (src == des) return true;
        if (vis[src]) return false;

        vis[src] = true;

        for (int nbr : adj.get(src)) {
            if (dfs(adj, nbr, des)) {
                return true;
            }
        }
        return false;
    }
}