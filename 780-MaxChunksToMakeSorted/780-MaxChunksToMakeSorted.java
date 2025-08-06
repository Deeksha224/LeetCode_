// Last updated: 8/6/2025, 11:08:24 AM
class Solution {
    public int maxChunksToSorted(int[] arr) {
        int ans = 0;
        int prefixSum = 0;
        int sortedPrefixSum = 0;

        for (int i = 0; i < arr.length; i++){
            prefixSum += arr[i];
            sortedPrefixSum += i;
            if (prefixSum == sortedPrefixSum){
                ans++;
            }
        }
        return ans;
    }
}