// Last updated: 8/6/2025, 11:07:59 AM
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        // calculate max,min and total 
        // circular array = total - min
        int currentMax = 0;
        int currentMin = 0;

        int maxSoFar = nums[0];
        int minSoFar = nums[0];

        int total = 0;

        for (int i = 0; i < nums.length; i++){ //normal kadane's
            currentMax = Math.max(nums[i],nums[i]+currentMax);
            maxSoFar = Math.max(currentMax,maxSoFar);

            currentMin = Math.min(nums[i],nums[i]+currentMin); //kadane's to find min
            minSoFar = Math.min(currentMin,minSoFar);

            total += nums[i];
        }
        if (total == minSoFar){ // special case, if all elements are -ve
            return maxSoFar;
        }
        return Math.max(total- minSoFar,maxSoFar );
    }
}