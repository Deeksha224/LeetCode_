class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()){
            return false;
        }

        int[] s1Freq = new int[26];
        int[] s2Freq = new int[26];

        // count the frequency for the first window of s2
        for (int i = 0; i < s1.length(); i++){
            s1Freq[s1.charAt(i)-'a']++;
            s2Freq[s2.charAt(i)-'a']++;
        }

        // sliding over s2
        for (int i = 0; i < s2.length() - s1.length(); i++){
            if (match(s1Freq,s2Freq)){
                return true;
            }
            // updating the window
            s2Freq[s2.charAt(i)-'a']--;
            s2Freq[s2.charAt(i + s1.length())-'a']++;
        }
        return match(s1Freq,s2Freq);
        
    }
    private boolean match(int[] s1Freq, int[] s2Freq) {
        for (int i = 0; i < 26; i++) {
            if (s1Freq[i] != s2Freq[i]) return false;
        }
        return true;
    }
}