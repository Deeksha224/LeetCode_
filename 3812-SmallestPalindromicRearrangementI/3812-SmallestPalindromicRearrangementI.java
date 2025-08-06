// Last updated: 8/6/2025, 11:04:13 AM
class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26]; 
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        char[] first = new char[s.length() / 2];
        int index = 0;
        char mid = 0;

        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 == 1 && mid == 0) {
                mid = (char) (i + 'a');
            }

            for (int j = 0; j < freq[i] / 2; j++) {
                first[index] = (char) (i + 'a');
                index++;
            }
        }
        StringBuilder firstHalf = new StringBuilder();
        for (int i = 0; i < index; i++) {
            firstHalf.append(first[i]);
        }

        StringBuilder secondHalf = new StringBuilder();
        for (int i = index - 1; i >= 0; i--) {
            secondHalf.append(first[i]);
        }

        if (s.length() % 2 == 1) {
            return firstHalf.toString() + mid + secondHalf.toString();
        }     
        return firstHalf.toString() + secondHalf.toString();
    }
}