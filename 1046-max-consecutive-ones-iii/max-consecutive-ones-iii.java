class Solution {
    public int longestOnes(int[] nums, int k) {
        int j = 0;
        int count= 0;
        int max = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==0){
                count++;
            }
            while(count>k){
                if(nums[j] == 0){
                    count--;
                }
                j++;
            }
            max = Math.max(i-j+1,max);
        }
        return max;
    }
}