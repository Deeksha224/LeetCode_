class Solution {
    public int partitionString(String s) {
        int count = 1;
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
            }
            else{
               set = new HashSet<>();
               set.add(s.charAt(i));
               count++; 
            }
        }
        return count;
    }
}