// Last updated: 8/6/2025, 11:07:21 AM
class Solution {
    public boolean canConstruct(String s, int k) {
        if (s.length() < k){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }

        int count = 0;

        for (char i : map.keySet()) {
            if (!(map.get(i) % 2 == 0)){
                count++;
            }
        }
        if (count <= k){
            return true;
        }
        return false;
    }
}