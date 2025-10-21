class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int start = 1;
        int end = Integer.MAX_VALUE;
        int ans = end;

        while (start <= end){
            int mid = start + (end - start)/2;
            if (isPossible(nums,mid,maxOperations)){
                end = mid-1;
                ans = mid;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }
    public boolean isPossible(int[] nums, int mid, int maxOperations){
        int count = 0;
        for (int num:nums){
            count += ((num-1)/mid);
        }
        return count <= maxOperations;
    }
}