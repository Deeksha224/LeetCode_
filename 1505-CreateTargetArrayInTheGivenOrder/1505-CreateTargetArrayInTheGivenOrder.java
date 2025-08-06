// Last updated: 8/6/2025, 11:07:19 AM
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList <Integer> target = new ArrayList <>();
        for (int i = 0; i < index.length; i++){
            target.add(index[i], nums[i]);
        }

        int[] arr = new int[target.size()];
        for (int i = 0; i < target.size(); i++){
            arr[i] = target.get(i);
        }
        return arr;
    }
}