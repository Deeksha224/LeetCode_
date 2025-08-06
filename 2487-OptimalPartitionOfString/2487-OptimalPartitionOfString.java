// Last updated: 8/6/2025, 11:05:26 AM
class Solution {
    public int partitionString(String s) {
        StringBuilder s1 = new StringBuilder();
        int count = 1;
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (!(s1.toString().contains(String.valueOf(ch)))){
                s1.append(s.charAt(i));
            }
            else{
                count++;
                s1.setLength(0);
                s1.append(s.charAt(i));
            }
        }
        return count;
    }
}