// Last updated: 8/6/2025, 11:11:49 AM
class Solution {
    public int lengthOfLastWord(String s) {
      s.trim();
        String[] arr = s.split(" ");
        int index = arr.length;
        String str = "";
        str += arr[index - 1];
        return (str.length());
    }
}