class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
       ArrayList<Integer> less = new ArrayList<>();
       ArrayList<Integer> equal = new ArrayList<>();
       ArrayList<Integer> greater = new ArrayList<>();
       for(int i = 0; i < nums.length; i++){
            if (nums[i] < pivot){
                less.add(nums[i]);
            }
            if (nums[i] == pivot){
                equal.add(nums[i]);
            }
            if(nums[i] > pivot){
                greater.add(nums[i]);
            }
        }
        int[] num = new int[nums.length];
        for(int i = 0; i < less.size(); i++){
            num[i] = less.get(i);
        }
        for (int i = 0; i < equal.size(); i++){
            num[i+less.size()] = equal.get(i);
        }
        for (int i = 0; i < greater.size(); i++){
            num[i+less.size()+equal.size()] = greater.get(i);
        }
        return num;
    }
}