class Solution {
    public int majorityElement(int[] nums) {
        // First approach
        // int max = 0, count = 0, ans = 0;
        // Arrays.sort(nums);
        // if (nums.length == 1){
        //     return nums[0];
        // }
        // for (int i = 0; i < nums.length - 1; i++){
        //     if (nums[i] == nums[i + 1]){
        //         count ++;
        //         if (max < count){
        //             max = count;
        //             ans = nums[i];
        //         }
        //     }
        //     else{
        //         count = 0;
        //     }
        // }
        // return ans;

        // Second approach
        // Arrays.sort(nums);
        // return nums[(nums.length / 2)];

        // Third Approach ( MorreVoting)
        // int e = nums[0];
        // int v = 1;
        // for (int i = 0; i < nums.length; i++){
        //     if (nums[i] == e){
        //         v++;
        //     }
        //     else {
        //         v--;
        //         if (v == 0){
        //             e = nums[i];
        //             v=1;
        //         }
        //     }
        // }
        // return e;
        int count = 0;
        int candidate = nums[0];
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == candidate){
                count++;
            }
            else{
                count--;
                if (count == -1){
                    candidate = nums[i];
                    count = 0;
                }
            }
        }
        return candidate;
    }
}