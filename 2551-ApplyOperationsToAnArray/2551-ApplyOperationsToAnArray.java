// Last updated: 8/6/2025, 11:05:17 AM
class Solution {
    public int[] applyOperations(int[] nums) {
        ArrayList<Integer> l = new ArrayList<>();
        int i;
        for (i = 0; i < nums.length-1; i++){
            if (nums[i] != nums[i+1]){
                l.add(nums[i]);
            }
            if (nums[i] == nums[i+1]){
                l.add(nums[i] * 2);
                l.add(0);
                i++;
            }
        }
        if (i < nums.length){
                l.add(nums[nums.length - 1]);
            }
        int[] num = new int[nums.length];
        int a  = 0;
        for (int j = 0; j < l.size(); j++){
            if (l.get(j) != 0){
                num[a] = l.get(j);
                a++;
            }
        }
        return num;
    }
}