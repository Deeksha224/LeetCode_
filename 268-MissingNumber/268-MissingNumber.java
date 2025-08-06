// Last updated: 8/6/2025, 11:10:03 AM
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int temp = 0;
        if (nums[0] == 0){
            for (int i = 1; i < nums.length; i++){
                if (temp + 1 != nums[i] ){
                    return temp + 1;
                }
                temp += 1;
            }
            return temp + 1;
        }
        return 0;
    }
}