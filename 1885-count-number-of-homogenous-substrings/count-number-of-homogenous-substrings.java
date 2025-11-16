class Solution {
    public int countHomogenous(String s) {
        long ans = 0;
        long mod = 1000000007;
        long count = 1;
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length - 1; i++){
            if(ch[i] == ch[i+1]){
                count++;
            }
            else{
                ans = (ans + count * (count+1) / 2) % mod;
                count = 1;
            }
        }
        ans = (ans + count * (count+1) / 2) % mod;
        return (int)ans;
    }
}