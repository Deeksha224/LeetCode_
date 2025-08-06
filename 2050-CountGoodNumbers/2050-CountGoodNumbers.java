// Last updated: 8/6/2025, 11:06:27 AM
class Solution {
    public int countGoodNumbers(long n) {
        return (int) ((exp (5,(n+1)/2) * exp (4,n/2)) % 1000000007);
        
    }
    public long exp(int x, long y){
        long ans = 1;
        long mul = x;
        while (y > 0){
            if (y % 2 != 0){
                ans = (ans * mul) % 1000000007;
            }
            mul = (mul * mul) % 1000000007;
            y /= 2;
        }
        return ans % 1000000007;
    }
}