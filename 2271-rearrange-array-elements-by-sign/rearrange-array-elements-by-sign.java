class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> arr_n = new ArrayList<>();
        ArrayList<Integer> arr_p = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            if (nums[i] < 0){
                arr_n.add(nums[i]);
            }
            else{
                arr_p.add(nums[i]);
            }
        }
        int a = 0;
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length-1; i+=2){
            ans[i] = arr_p.get(a);
            ans[i+1] = arr_n.get(a);
            a++;
        }
        return ans;
    }
}