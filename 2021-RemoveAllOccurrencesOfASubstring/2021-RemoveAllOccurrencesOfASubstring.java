// Last updated: 8/6/2025, 11:06:30 AM
class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder si = new StringBuilder(s);
        while (si.indexOf(part) != -1){
            int t = si.indexOf(part);
            si.replace(t, t + part.length(), "");
        }
        return si.toString();
    }
}