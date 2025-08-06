// Last updated: 8/6/2025, 11:09:33 AM
class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> freq = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer> freq1= new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            freq1.put(ch,freq1.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
           if(freq1.get(ch)!=freq.get(ch)){
                return ch;
            }
        }
        return 'a';
    }
}