class Solution {
    public static int mod = 12345;
    public int[][] constructProductMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int a = 0;
        int[] arr = new int[n*m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[a++] = grid[i][j];
            }
        }
        long[] pre = new long[arr.length];
        pre[0] = 1;
        for(int i = 1; i < pre.length; i++){
            pre[i] = (pre[i-1] * arr[i-1])%mod;
            //System.out.println(pre[i]);
        }

        long[] suf = new long[arr.length];
        suf[suf.length-1] = 1;
        for(int i = suf.length-2; i >= 0; i--){
            suf[i] = (suf[i+1] * arr[i+1])%mod;
        }
        long[] temp = new long[arr.length];
        for(int i = 0; i < n*m; i++){
            temp[i] = (pre[i]*suf[i])%mod;
            //System.out.println(temp[i]);
        }
        int b = 0;
        int[][] ans = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                ans[i][j] = (int)(temp[b++])%mod;
            }
        }
        return ans;
        
    }
}