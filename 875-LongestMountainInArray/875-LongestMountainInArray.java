// Last updated: 8/6/2025, 11:08:18 AM
class Solution {
    public int longestMountain(int[] arr) {
        int ans = 0;
        for(int i = 1; i < arr.length - 1; i++){
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]){
                int left = i - 1;
                int right = i + 1;

                while (left > 0 && arr[left] > arr[left - 1]){
                    left--;
                }
                while (right < arr.length - 1 && arr[right] > arr[right + 1]){
                    right++;
                }
                ans = Math.max(ans,right - left + 1);
            }
        }
        return ans;
    }
}