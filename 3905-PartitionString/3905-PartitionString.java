// Last updated: 8/6/2025, 11:04:06 AM
class Solution {
    public List<String> partitionString(String s) {
        HashSet<String> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();
        int i = 0;
        while (i < s.length()){
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < s.length(); j++){
                sb.append(s.charAt(j));
                if (!set.contains(sb.toString())){
                    set.add(sb.toString());
                    list.add(sb.toString());
                    sb.setLength(0);
                }
                i = j+1;
            }
            
        }
        return list;
    }
}