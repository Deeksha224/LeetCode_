class Solution {
    public int maximumCandies(int[] nums, long k) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums[nums.length-1];
        int ans = 0;
        
        while (start < end){
            int mid = (start+end+1)/2;
            if (isPossible (nums,k,mid)){
                ans = mid;
                start = mid;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
    public boolean isPossible (int[] nums, long k, int mid){
        long count = 0;
        for (int num: nums){
            count += num/mid;
        }
        return count>=k;
    }
}