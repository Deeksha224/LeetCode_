// Last updated: 8/6/2025, 11:07:00 AM
class Solution {
    public String restoreString(String s, int[] indices) {
      StringBuilder sb = new StringBuilder(s);
      for (int i = 0; i < indices.length; i++){
        sb.setCharAt(indices[i], s.charAt(i));
      }  
      return sb.toString();
    }
}