// Last updated: 8/6/2025, 11:04:02 AM
class Solution {
    public boolean checkDivisibility(int n) {
        int m = n;
        int sum = 0;
        long pro = 1;
        while (n  > 0){
            int temp = n % 10;
            sum += temp;
            pro *= temp;
            n /= 10;
        }
        long ans = sum + pro;
        // System.out.print(ans);
        if (m % ans == 0){
            return true;
        }
        return false;
    }
    
}