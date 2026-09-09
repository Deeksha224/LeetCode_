class Solution {
    public long countCommas(long n) {
        long c = 0;
        long temp = 1000;
        while(temp<=n){
            c = c+ n-temp+1;
            temp *= 1000;
        }
        return c;
    }
}