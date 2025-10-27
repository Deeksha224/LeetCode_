class Solution {
    public boolean canPlaceFlowers(int[] nums, int n) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0){
                boolean left = (i==0) || (nums[i-1] == 0);
                boolean right = (i == nums.length-1) || (nums[i+1] == 0);
    
                if (left && right){
                    count++;
                    nums[i] = 1;
                }
            }
        }
        return count >= n;
    }
}