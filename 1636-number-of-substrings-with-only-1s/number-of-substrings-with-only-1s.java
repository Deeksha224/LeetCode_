class Solution {
    public int numSub(String s) {
        long mod = 1000000007;
        long count1 = 0;
        long ans = 0;
        for (char i : s.toCharArray()){
            if (i == '1'){
                count1++;
            }
            else{
                ans = (ans + count1 * (count1 + 1) / 2) % mod;
                count1 = 0;
            }
        }
        ans = (ans + count1 * (count1 + 1) / 2) % mod;
        return (int)(ans % mod);
    }
}