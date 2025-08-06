// Last updated: 8/6/2025, 11:05:39 AM
class Solution {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for (int i = 0; i < words.length; i++){
            if (s.startsWith(words[i])){
                count++;
            }
        }
        return count;
    }
}