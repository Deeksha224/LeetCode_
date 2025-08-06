// Last updated: 8/6/2025, 11:11:45 AM
class Solution {
    public int mySqrt(int x) {
        long start = 0;
        long end = x;
        long mid = 0;
        while (start <= end){
            mid = start + (end - start) / 2;
            if (mid * mid > x){
                end = mid - 1;
            }
            else if (mid * mid == x){
                return (int)mid;
            }
            else {
                start = mid + 1;
            }
        }
        return (int)end ;
    }
}