// Last updated: 8/6/2025, 11:12:02 AM
class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 0){
                hs.add(nums[i]);
            }
        }
        int ans = 1;
        while (hs.contains(ans)){
            ans++;
        }
        return ans;
    }
}