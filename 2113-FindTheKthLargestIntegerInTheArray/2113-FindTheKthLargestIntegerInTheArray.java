// Last updated: 8/6/2025, 11:06:23 AM
import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        BigInteger[] arr = new BigInteger[nums.length];
        for (int i = 0; i < nums.length; i++){
            arr[i] = new BigInteger(nums[i]);
        }
        Arrays.sort(arr);
        int idx = nums.length - k;
        String ans = arr[idx] + "";
        return ans;
    }
}