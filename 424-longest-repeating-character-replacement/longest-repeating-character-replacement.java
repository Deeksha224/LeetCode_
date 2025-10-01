class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int res = 0;
        int max = 0;
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            arr[s.charAt(r) - 'A']++;
            max = Math.max(max, arr[s.charAt(r) - 'A']); // checking max occurence
            if (r - l + 1 - max > k) {  // if window size is invalid we simply reduce the window size 
                arr[s.charAt(l) - 'A']--;
                l++;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}