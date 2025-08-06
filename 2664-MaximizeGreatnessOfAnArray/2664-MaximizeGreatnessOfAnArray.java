// Last updated: 8/6/2025, 11:05:04 AM
class Solution {
    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int count = 0;

        int i = 0;
        int j = 0;
        while (i < nums.length){
            while (j < nums.length){
                if (nums[i] < nums[j]){
                    count++;
                    j++;
                    break;
                }
                else{j++;}
            }
            i++;
        }
        return count;
    }
}