// Last updated: 8/6/2025, 11:06:58 AM
class Solution {
    public int minFlips(String target) {
        int count = 0;
        char a = '0';
        for (int i = 0; i < target.length(); i++){
            if (target.charAt(i) != a){
                count++;
                a = target.charAt(i);
            }
        }
        return count;
    }
}