// Last updated: 8/6/2025, 11:07:49 AM
class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] rem = new int[60];
        for (int i = 0; i < time.length; i++){
            rem[time[i] %60]++;
        }
        int count = 0;
        count += (int)(rem[0]/2.0 * (rem[0]-1));
        count += (int)(rem[30]/2.0 * (rem[30]-1));
        for (int i = 1; i<=29; i++){
            count += (int)(rem[i] * rem[60-i]);
        }
        return (int)count;
    }
}