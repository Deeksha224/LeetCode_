class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i  < nums.length-1; i++){
            for(int j = nums[i]+1; j < nums[i+1]; j++){
                list.add(j);
            }
        }
        return list;
        //1,2,4,5
    }
}