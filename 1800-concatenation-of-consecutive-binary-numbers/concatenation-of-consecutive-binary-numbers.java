class Solution {
    int mod = 1000000007;
    public int concatenatedBinary(int n) {
        long ans = 0;
        int bits = 0;
        for(int i = 1; i<=n; i++){
            if((i & (i-1)) == 0) bits++;
            ans = ((ans<<bits)+i)%mod;
        }
        return (int)ans;
    }
}


// class Solution {
//     long mod = 1000000007L;
//     public int concatenatedBinary(int n) {
//         String ans = "";
//         for(int i = 1; i <= n; i++){
//             String temp = Integer.toBinaryString(i);
//             ans += temp;
//         }
//         long a = Long.parseLong(ans)%mod;
//         return (int)a;
//     }
// }