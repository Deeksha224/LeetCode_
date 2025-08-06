// Last updated: 8/6/2025, 11:12:16 AM
class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0;
        for (int j = needle.length(); j <= haystack.length(); j++){
            if (haystack.substring(i,j).equals(needle)){
                return i;
            }
            i++;
        }
        return -1;
    }
}