// Last updated: 8/6/2025, 11:06:20 AM
class Solution {
    public long gridGame(int[][] grid) {
        long[] ans = new long[grid[0].length];
        long sum1=0,sum2=0;
        for(int i=0 ;i<grid[0].length ; i++){
            sum1+=grid[0][i];
        }
        for(int i=0 ;i<grid[0].length ; i++){
            sum1 -= grid[0][i];
            ans[i] = Math.max(sum1,sum2);
            sum2 += grid[1][i];
        }
        long min = Long.MAX_VALUE;
        for(int i=0 ;i<ans.length ; i++){
            if(ans[i]<min){
                min = ans[i];
            }
        }
        return min;
    }
}