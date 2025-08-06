// Last updated: 8/6/2025, 11:08:05 AM
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList <Integer> arr_even = new ArrayList<>();
        ArrayList <Integer> arr_odd = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0){
                arr_even.add(nums[i]);
            }
            else{
                arr_odd.add(nums[i]);
            }
        }
        for (int i = 0; i < arr_odd.size(); i++){
            arr_even.add(arr_odd.get(i));
        }
        for (int i = 0; i < arr_even.size(); i++){
            nums[i] = arr_even.get(i);
        }
        return nums;
    }
}