class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lis = new ArrayList<>();
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
            answer(nums,i+1,lis,li);
            li.remove(li.size()-1);
        }
    }
}