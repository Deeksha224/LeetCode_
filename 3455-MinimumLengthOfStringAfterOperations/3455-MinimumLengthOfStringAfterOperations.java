// Last updated: 8/6/2025, 11:04:35 AM
class Solution {
    public int minimumLength(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        int count = 0;
        for (int i : map.values()){
            if (i%2 == 0){
                count += 2;
            }
            else{
                count += 1;
            }
        }
        return count;
    }
}