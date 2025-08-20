class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;
        long total = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0){
                count++;
            }
            if (nums[i] != 0){
                total = total + count * (count+1)/2;
                count = 0;
            }
        }
        total = total + count * (count+1)/2;
        return total;
    }
}