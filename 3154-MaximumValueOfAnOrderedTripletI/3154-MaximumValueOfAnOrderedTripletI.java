// Last updated: 8/6/2025, 11:04:54 AM
class Solution {
    public long maximumTripletValue(int[] nums) {
        long max = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                for (int k = j+1; k< nums.length;k++){
                    long ans = ((nums[i] - nums[j]) * (long)nums[k]);
                    if (max < ans){
                        max = ans;
                    }
                }
            }
        }
        return max;
    }
}