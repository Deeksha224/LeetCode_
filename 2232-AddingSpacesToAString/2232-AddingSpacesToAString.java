// Last updated: 8/6/2025, 11:06:12 AM
class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder si = new StringBuilder(s);
        for(int i=0 ; i<spaces.length ; i++){
            si.insert(spaces[i]+i," ");
        }
        return si.toString();
    }
}