// Last updated: 8/6/2025, 11:04:22 AM
class Solution {
    public String findValidPair(String s) {
        int[] fre = new int[10]; 
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            fre[ch - '0']++;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            char a = s.charAt(i);
            char b = s.charAt(i + 1);
            if (a != b && fre[a - '0'] == a - '0' && fre[b - '0'] == b - '0') {
                return "" + a + b;
            }
        }
        return "";
    }
}