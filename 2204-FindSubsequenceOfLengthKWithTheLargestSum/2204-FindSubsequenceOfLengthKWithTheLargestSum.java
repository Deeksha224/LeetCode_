// Last updated: 8/6/2025, 11:06:15 AM
class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int[][] vals = new int[n][2]; // 2-d array stores index and values
        for (int i = 0; i < n; i++){
            vals[i][0]= nums[i]; // value
            vals[i][1]=i; // index
        }
        //Sort by value in descending order
        // This compares values (a[0] and b[0]) and sorts bigger values first
        Arrays.sort(vals, (a, b) -> b[0] - a[0]);

        // Take first k elements and sort them by original index
        Arrays.sort(vals, 0, k, (a, b) -> a[1] - b[1]);

        int[] ans = new int[k];
        for (int i = 0; i < k; i++){
            ans[i] = vals[i][0];
        }
        return ans;
    }
}