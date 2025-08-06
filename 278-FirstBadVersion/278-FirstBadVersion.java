// Last updated: 8/6/2025, 11:09:58 AM
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)){
                end = mid - 1;
            }
            else if (isBadVersion(mid) == false){
                start = mid + 1;
            }
        }
        return end + 1;
    }
}