// Last updated: 8/6/2025, 11:12:46 AM
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0]+nums[1]+nums[2]; //best case

        for (int i = 0; i < nums.length -2; i++){
            int left = i+1;
            int right = nums.length -1;

            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(target - sum) < Math.abs(target-ans)) {
                    ans = sum;
                }
                if (target == sum){
                    return sum;
                }
                else if (sum > target){
                    right--;
                }
                else{
                    left++;
                }
            } 
        }
        return ans;
    }
}