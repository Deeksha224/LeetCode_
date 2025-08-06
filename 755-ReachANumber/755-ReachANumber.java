// Last updated: 8/6/2025, 11:08:27 AM
class Solution {
    public int reachNumber(int target) {
        int m = 0;
        int step = 0;
        if (target < 0){
            target *= -1;
        }
        while (m < target){
            m += step;
            step++;
        }
        while (((m - target) % 2 != 0)){
            m += step;
            step++;
        }
        return step - 1;
    }
}