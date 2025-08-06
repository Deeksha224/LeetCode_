// Last updated: 8/6/2025, 11:04:39 AM
class Solution {
    public boolean isArraySpecial(int[] nums) {
        int flag = 0;
        if (nums.length < 2){
            return true;
        }
        for (int i = 0; i < nums.length - 1; i++){
            if ((nums[i] % 2 == 0 && nums[i+1] % 2 !=0) || nums[i] % 2 != 0 && nums[i+1] % 2 == 0){
                flag ++;
            }
        }
        if (flag < nums.length - 1){
            return false;
        }
        return true;
    }
}