// Last updated: 8/6/2025, 11:11:35 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int k = 0; 
        for (int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
            if (map.get(num) <= 2){
                nums[k] = num;
                k++;
            }
        }
        return k;
    }
}