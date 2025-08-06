// Last updated: 8/6/2025, 11:06:45 AM
class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int highest = 0;
        for (int i = 0; i < gain.length; i++){
            altitude += gain[i];

            if (altitude > highest){
                highest = altitude;
            }
        }
        return highest;
        
    }
}