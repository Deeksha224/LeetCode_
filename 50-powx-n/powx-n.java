class Solution {
    public double myPow(double x, int N) {
        long n = N;
        if(n < 0){
            x = 1/x;
            n = -n;
        }
        double ans = 1;
        while(n > 0){
            if(n%2 != 0){
                ans = ans*x;
            }
            x*=x;
            n/=2;
        }
        return ans;
        
    }
}