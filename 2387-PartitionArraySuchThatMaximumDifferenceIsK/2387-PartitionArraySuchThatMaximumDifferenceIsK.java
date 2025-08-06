// Last updated: 8/6/2025, 11:05:37 AM
class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int ans=nums[0];
        int count=1;
        for(int i=1; i<nums.length ; i++){
            if(nums[i]>ans+k){
                count++;
                ans=nums[i];
            }
        }
        return count;
    }
}