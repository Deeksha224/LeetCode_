// Last updated: 8/6/2025, 11:04:08 AM
class Solution {
    public int minSwaps(int[] nums) {
        List<Integer> even_index = new ArrayList<>();
        List<Integer> odd_index = new ArrayList<>();

        for (int i = 0; i< nums.length; i++){
            if (nums[i] % 2 == 0){
                even_index.add(i);
            }
            else{
                odd_index.add(i);
            }
        }
        int even = even_index.size();
        int odd = odd_index.size();
        if (Math.abs(even-odd) >1){
            return -1;
        }
        int result = Integer.MAX_VALUE;
        if (even >= odd){
            result = Math.min(result,fun(even_index));
        }
        if (odd >= even){
            result = Math.min(result,fun(odd_index));
        }
        return result;
    }
    public int fun (List<Integer> index){
        int ans = 0;
        for (int i = 0; i < index.size(); i++){
            ans += Math.abs(index.get(i) - 2*i);
        }
        return ans;
    }
}