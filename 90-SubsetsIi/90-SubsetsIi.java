// Last updated: 8/6/2025, 11:11:25 AM
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> lis = new ArrayList<>();
        Arrays.sort(nums);
        answer(nums, 0, lis, new ArrayList<>());
        return lis;
    }
        
    public static void answer(int[] nums,int ind,List<List<Integer>> lis,List<Integer> li){
        lis.add(new ArrayList<>(li));
        if (ind == nums.length){
            return;
        }
        for (int i = ind; i < nums.length; i++){
            li.add(nums[i]);
            if (!lis.contains(li)){
                answer(nums,i+1,lis,li);
            }
            li.remove(li.size()-1);
        }
    }
}