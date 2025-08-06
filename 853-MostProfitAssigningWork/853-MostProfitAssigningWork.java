// Last updated: 8/6/2025, 11:08:21 AM
class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int[][] arr = new int[profit.length][2];

        for (int i = 0; i < profit.length; i++){
            arr[i][0] = difficulty[i];
            arr[i][1] = profit[i];
        }

        Arrays.sort(worker);
        Arrays.sort(arr,(a,b)->a[0]-b[0]);

        int ans = 0;
        int maxProfit = 0;
        int idx = 0;

        for (int i = 0; i < worker.length; i++){
            while (idx < profit.length && worker[i] >= arr[idx][0]){
                maxProfit = Math.max(maxProfit,arr[idx][1]);
                idx++;
            }
            ans += maxProfit;
        }
        return ans;
    }
}