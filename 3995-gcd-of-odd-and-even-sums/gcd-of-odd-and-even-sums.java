class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = n*n;
        int sumEven = n*(n+1);
        return gcd(sumOdd,sumEven);
    }
    public int gcd(int a, int b){
        while(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}  