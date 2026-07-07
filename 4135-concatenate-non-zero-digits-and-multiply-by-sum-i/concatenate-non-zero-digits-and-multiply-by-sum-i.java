class Solution {
    public long sumAndMultiply(int n) {
        if(n==0) return 0;
        StringBuilder ans = new StringBuilder();
        long sum = 0;
        while(n>0){
            long a = n%10;
            if(a!= 0){
                sum += a;
                ans.append(a);
            }
            n/=10;
        }
        ans.reverse();

        return Long.parseLong(ans.toString())*sum;
    }
}