class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }
        int left = 1;
        int right = max;
        int ans = Integer.MAX_VALUE;

        while(left <= right){
            int mid = left+(right-left)/2;
            if(helper(nums,threshold,mid)){
                ans = Math.min(ans,mid);
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return ans;
    }
    public boolean helper(int[] nums, int threshold, int d){
        long sum = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            sum+=(int)(Math.ceil((double)nums[i]/d));
        }
        return (sum <= threshold);
    }
}