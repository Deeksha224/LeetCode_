class Solution {
    public boolean hasAllCodes(String s, int k) {
        int r = (int)Math.pow(2,k);
        if(s.length() < k) return false;
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i <= s.length()-k; i++){
            String a = s.substring(i,i+k);
            set.add(a);
        }
        if(set.size()== r) return true;
        return false;
    }
}