// Last updated: 8/6/2025, 11:04:59 AM
class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++){ 
            set.add(nums[i]);
        }

        int count = 0;
        for (int i = 0; i < nums.length; i++){
            HashSet<Integer> set2 = new HashSet<>();
            for (int j = i; j < nums.length; j++){
                set2.add(nums[j]);
                if (set.size() == set2.size()){
                    count++;
                }
            }
            
        }
        return count;
    }
}