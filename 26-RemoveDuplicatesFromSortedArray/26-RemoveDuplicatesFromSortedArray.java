// Last updated: 8/6/2025, 11:12:38 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i] == nums[i + 1]){
                count++;
            }
        }
        int res = nums.length - count;
        int[] arr = new int[res];
        int num = nums[0], max = nums[0], a = 1;
        arr[0] = nums[0];
        for (int i = 0; i < nums.length - 1; i++){
            num = Math.max(num, nums[i+1]);
            if (num > max){
                max = num;
                arr[a] = max;
                a++;
            }
        }
        for (int  i = 0; i < res; i++){
            nums[i] = arr[i];
        }
        return res;
    }
}