class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int prev = Integer.MIN_VALUE;
        for (int num:nums){
            int start = num-k;
            int end = num+k;
            int place = Math.max(prev+1, start);
            if (place <= end){
                count++;
                prev = place;
            }
        }
        return count;
    }
}