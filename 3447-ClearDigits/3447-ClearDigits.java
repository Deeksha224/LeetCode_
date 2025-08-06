// Last updated: 8/6/2025, 11:04:38 AM
class Solution {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) -'0' >= 0 && s.charAt(i) - '0' <= 9){
                sb.deleteCharAt(sb.length()-1);
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}