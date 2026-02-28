class Solution {
    int mod = 1000000007;
    public int concatenatedBinary(int n) {
        long ans = 0;
        int bits = 0;
        for(int i = 1; i<=n; i++){
           // if((i & (i-1)) == 0) bits++;
            bits = Integer.toBinaryString(i).length();
            ans = ((ans<<bits)+i)%mod;
        }
        return (int)ans;
    }
}
