// Last updated: 8/6/2025, 11:08:31 AM
class Solution {
    public int monotoneIncreasingDigits(int n) {
        char[] s = Integer.toString(n).toCharArray();
        int i = 1;
        while (i < s.length && s[i-1] <= s[i]){
            i++;
        }
        //condition if monotonic break at i
        while (i > 0 && i < s.length && s[i-1] > s[i]){
            i--;
            s[i]--;
        }

        // append rest with 9
        for (int j = i+1; j < s.length; j++){
            s[j] = '9';
        }

        String ans = new String(s);
        int num = Integer.parseInt(ans);
        return num;
    }
}