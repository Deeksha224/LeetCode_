// Last updated: 8/6/2025, 11:07:08 AM
class Solution {
    public int kthFactor(int n, int k) {
        int count = k;
        for (int i = 1; i <= n; i++){
            if (n%i == 0){
                count--;
            }
            if (count==0){
                return i;
            }
        }
        return -1;
    }
}