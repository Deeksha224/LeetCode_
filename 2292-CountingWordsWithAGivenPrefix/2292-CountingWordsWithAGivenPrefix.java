// Last updated: 8/6/2025, 11:06:09 AM
class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for (int i = 0; i < words.length; i++){
            if (words[i].startsWith(pref)){
                count++;
            }
        }
        return count;
    }
}