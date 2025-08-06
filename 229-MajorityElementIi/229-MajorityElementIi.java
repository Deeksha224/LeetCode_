// Last updated: 8/6/2025, 11:10:26 AM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        ArrayList<Integer> l = new ArrayList<>();
        int n = nums.length/3;
        for (int i :map.keySet()){
            if (map.get(i) > n){
                l.add(i);
            }
        }
        return l;
    }
}