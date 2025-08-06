// Last updated: 8/6/2025, 11:09:57 AM
class Solution {
    public void moveZeroes(int[] nums) {
        int a = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[a];
                nums[a] = temp;
                a++;
            }
        }
    }
}