class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
       long low = 0;
        long high = (long)1e18;
        long ans = (long)1e18;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (solve(mountainHeight, workerTimes, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans; 
    }

    public boolean solve(long height, int[] time, long T) {
        long heightCanBeBroken = 0;
        for (int ti : time) {
            long h = (long)((-1 + Math.sqrt(1 + (8.0 * T) / ti)) / 2);
            heightCanBeBroken += h;
            if (heightCanBeBroken >= height) {
                return true;
            }
        }
        return false;
    }
}