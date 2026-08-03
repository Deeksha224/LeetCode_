class Solution {
    public boolean predictTheWinner(int[] nums) {
        int ans1 = solve(0,nums.length-1, nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum+=nums[i];
        }
        int ans2 = sum - ans1;
        if(ans1>=ans2) return true;
        return false; 
        
    }
    public int solve(int i, int j, int[] nums){
        if(i>j) return 0;
        int takei = nums[i] + Math.min(solve(i+2,j,nums) , solve(i+1,j-1,nums));
        int takej = nums[j]+ Math.min(solve(i+1,j-1,nums) , solve(i,j-2,nums));

        return Math.max(takei,takej);

    }
}