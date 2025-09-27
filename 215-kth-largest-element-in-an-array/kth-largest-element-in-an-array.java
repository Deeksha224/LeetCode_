class Solution {
    public int findKthLargest(int[] nums, int k) {
        int[][] val = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++){
            val[i][0] = nums[i];
            val[i][1] = i;
        }
        Arrays.sort(val, (a,b) -> b[0] - a[0]); // b-a is decending 
        return val[k-1][0];
    }
}