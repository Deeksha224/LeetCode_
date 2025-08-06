// Last updated: 8/6/2025, 11:08:35 AM
class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        int ans = 0, start = 0, end = 0, product = 1;
        while (end < arr.length){
            //grow
            product = product * arr[end];

            // shrink
            while (product >= k && start <= end){
                product = product / arr[start];
                start++;
            }
            // ans update
            ans = ans + (end - start + 1);
            end ++;
        }
        return ans;
    }
}