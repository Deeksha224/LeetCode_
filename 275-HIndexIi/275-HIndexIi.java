// Last updated: 8/6/2025, 11:10:00 AM
class Solution {
    public int hIndex(int[] citations) {
        int start = 0;
        int end = citations.length - 1;
        int ans = 0;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (citations.length - mid <= citations[mid]){
                ans = citations.length - mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }
}