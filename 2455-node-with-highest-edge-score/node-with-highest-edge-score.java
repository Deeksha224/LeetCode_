class Solution {
    public int edgeScore(int[] edges) {
        long[] sum = new long[edges.length];
        long ans=0;
        for(int i=0 ; i<edges.length ; i++){
            sum[edges[i]] += i;
            ans = Math.max(ans,sum[edges[i]]);
        }
        for(int i=0 ; i<edges.length ; i++){
            if(sum[i]==ans) return i;
        }
        return -1;
    }
}