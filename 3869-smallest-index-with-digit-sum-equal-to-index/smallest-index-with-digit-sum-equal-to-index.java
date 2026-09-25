class Solution {
    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            if (i == sum(nums[i])){
                return i;
            }
        }
        return -1;
    }
    public int sum(int a){
        int s = 0;
        while (a > 0){
            int temp = a % 10;
            s += temp;
            a/=10;
        }
        return s;
    }
}