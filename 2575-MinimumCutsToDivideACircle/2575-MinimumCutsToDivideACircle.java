// Last updated: 8/6/2025, 11:05:16 AM
class Solution {
    public int numberOfCuts(int n) {
        if (n == 1){
            return 0;
        }
        if (n%2 == 0){
            return n/2;
        }
        else{
            return n;
        }
    }
}