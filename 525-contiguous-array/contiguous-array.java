class Solution {
    public int findMaxLength(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i]==0){
                nums[i] = -1;
            }
        }
        int[] p = new int[nums.length];
        p[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            p[i] = p[i-1]+nums[i];
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(p[i] == 0){
                max = i+1;
            }
            if(map.get(p[i]) != null){
                if((i-map.get(p[i]))>max){
                    max = i-map.get(p[i]);
                }
            }
            if(map.get(p[i])==null){
                map.put(p[i],i);
            }
        }
        return max;
    }
}