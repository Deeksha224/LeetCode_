// Last updated: 8/6/2025, 11:04:00 AM
class Solution {
    public boolean isTrionic(int[] nums) {
        if (nums.length < 4){
            return false;
        }
        int first_inc = inc_end(nums,0);
        if (first_inc == 0 || first_inc == nums.length-1){
            return false;
        }
        int first_dec = dec_end(nums,first_inc);
        if (first_dec == first_inc || first_dec == nums.length-1){
            return false;
        }
        int second_inc = inc_end(nums,first_dec);
        if (second_inc > first_dec && second_inc == nums.length-1){
            return true;
        }
        return false;
    }
    public int inc_end (int[] nums, int start){
        int i = start;
        while (i+1 < nums.length && nums[i] < nums[i+1]){
            i++;
        }
        return i;
    }
    public int dec_end (int[] nums, int start){
        int i = start;
        while (i+1 < nums.length && nums[i] > nums[i+1]){
            i++;
        }
        return i;
    }
}