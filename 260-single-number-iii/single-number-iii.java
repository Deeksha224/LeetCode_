class Solution {
    public int[] singleNumber(int[] nums) {
        int n = 0;
        for(int i = 0; i < nums.length; i++){
            n = n^nums[i];
        }
        int mask = n & -n;
        int grp0 = 0;
        int grp1 = 0;
        for (int i = 0; i < nums.length; i++){
            if ((nums[i] & mask)!=0){
                grp1 ^= nums[i];
            }
            else{
                grp0 ^= nums[i];
            }
        }
        return new int[]{grp0,grp1};
    }
}