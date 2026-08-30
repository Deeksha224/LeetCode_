class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length == 1) return 1;
        int maxidx = 0;
        int minidx = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > nums[maxidx]){
                maxidx = i;
            }
             if(nums[i] < nums[minidx]){
                minidx = i;
            }
        }
        int left = Math.max(maxidx, minidx) + 1;

        int right = nums.length - Math.min(maxidx, minidx);

        int leftRight = Math.min(maxidx, minidx) + 1
                      + nums.length - Math.max(maxidx, minidx);

        return Math.min(left, Math.min(right, leftRight));
    }
}