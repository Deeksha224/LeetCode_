class Solution {
    public int minOperations(String s) {
        int sorted = 0;
        char[] ch = s.toCharArray();
        Arrays.sort(ch);

        for(int i = 0; i < s.length(); i++){
            if(ch[i] != s.charAt(i)){ 
                sorted++;
                break;
            }
        }

        if(sorted == 0) return 0;
        if(s.length() == 2) return -1;

        char min = ch[0];
        char max = ch[ch.length-1];
        if(min == s.charAt(0) || max == s.charAt(s.length()-1)) return 1;
        if(0 == s.lastIndexOf(max) && (s.indexOf(min) == s.length()-1)) return 3;
        return 2;
    }
} 