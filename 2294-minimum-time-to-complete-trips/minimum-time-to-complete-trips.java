class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long lo = 1;
        long hi = Long.MAX_VALUE; 
        while (lo < hi){
            long mid = lo + (hi-lo)/2;
            long completeTrip = 0;
            for (int t : time){
                completeTrip += mid/t;
                if (completeTrip >= totalTrips){
                    break;
                }
            }
            if (completeTrip >= totalTrips){
                hi = mid;
            }
            else{
                lo = mid+1;
            }
        }
        return lo;
    }
}