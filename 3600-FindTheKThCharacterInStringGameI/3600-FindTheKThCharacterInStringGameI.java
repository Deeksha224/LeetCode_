// Last updated: 8/6/2025, 11:04:32 AM
class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder("a");
        while(sb.length() < k){
            int size = sb.length();
            for (int i = 0; i < size; i++){
                sb.append((char)('a'+((sb.charAt(i)-'a')+1) % 26));
                // sb.append((char)((((sb.charAt(i)-'a')+1 )+'a') % 26));
            }


        }
        return sb.charAt(k-1);
    }
}