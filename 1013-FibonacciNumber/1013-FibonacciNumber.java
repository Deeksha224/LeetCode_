// Last updated: 8/6/2025, 11:07:53 AM
class Solution {
    public int fib(int n) {
        // Base condition
        if (n < 2){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}