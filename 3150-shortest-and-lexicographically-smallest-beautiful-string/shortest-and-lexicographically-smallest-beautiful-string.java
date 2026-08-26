class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while(i < s.length()){
            int j = i;
            int count = 0;
            while(j < s.length()){
                if(s.charAt(j) == '1'){
                    count++;
                    if(count == k) {
                        String temp = s.substring(i,j+1);
                        if(!list.contains(temp))
                            list.add(temp);
                        count = 0;
                        break;
                    }
                }
                j++;
            }
            i++;
        }
        // First: shortest length
        // Second: lexicographically smallest
        list.sort((a, b) -> {

            if(a.length() != b.length())
                return Integer.compare(a.length(), b.length());

            return a.compareTo(b);
        });

        if(list.size() == 0)
            return "";

        return list.get(0);
       
    }

}