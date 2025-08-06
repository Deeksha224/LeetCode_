// Last updated: 8/6/2025, 11:06:08 AM
class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> l = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++){
                if (nums[j] == key && Math.abs(i-j) <=k){
                    l.add(i);
                    break;
                }
            }
        }
        return l;
    }
}