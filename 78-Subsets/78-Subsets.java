// Last updated: 8/6/2025, 11:11:36 AM
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        answer(nums, 0, li, new ArrayList<>());
        return li;
    }

    public static void answer(int[] nums,int ind,List<List<Integer>> lis,List<Integer> li){
        lis.add(new ArrayList<>(li));
        if(ind==nums.length){
            return;
        }
        for(int i=ind ; i<nums.length ; i++){
            li.add(nums[i]);
            answer(nums,i+1,lis,li);
            li.remove(li.size()-1);
        }
    }
}