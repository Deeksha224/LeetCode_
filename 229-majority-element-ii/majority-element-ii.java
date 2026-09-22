class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> l = new ArrayList<>();
        for(int i : map.keySet()){
            if(map.get(i) > nums.length/3)
                l.add(i);
        }
        return l;
    }
}