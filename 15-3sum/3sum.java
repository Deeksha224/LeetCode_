class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue; //to avoid duplicacy
            }
            int j=i+1;
            int k = nums.length-1;
            int target = -nums[i];
            while(j<k){
                ArrayList<Integer> temp = new ArrayList<>();
                if(nums[j]+nums[k] == target){
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    res.add(temp);
                    //res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    while(j<k && nums[j] == nums[j+1]){
                        j++;
                    }
                    while(j<k && nums[k] == nums[k-1]){
                        k--;
                    }
                    j++;
                    k--;
                }
                else if(target > nums[j]+nums[k]){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
            return res;
    }
}