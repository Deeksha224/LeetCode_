// Last updated: 8/6/2025, 11:08:17 AM
class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char [] ans = s.toCharArray();
        long sum = 0;
        for (int i = s.length()-1; i>=0; i--){
            sum += shifts[i];
            int val = ans[i] - 'a';
            val = (int) ((val + sum) % 26);
            ans[i] = (char) ('a'+val);
        }
        return new String(ans);
    }
}