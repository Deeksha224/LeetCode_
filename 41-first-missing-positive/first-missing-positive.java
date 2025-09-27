class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean flag = false;

        //check if 1 exists
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                flag = true;
            }
        }
        if (flag == false) {
            return 1;
        }

        //replace invalid numbers (<=0 or > n) with 1
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0 || nums[i] > n) {
                nums[i] = 1;
            }
        }

        //mark presence
        for (int i = 0; i < nums.length; i++) {
            int temp = Math.abs(nums[i]);
            if (nums[temp - 1] > 0) {
                nums[temp - 1] = -nums[temp - 1];
            }
        }

        //find first missing positive
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }

        //if all are present
        return n + 1;
    }
}
