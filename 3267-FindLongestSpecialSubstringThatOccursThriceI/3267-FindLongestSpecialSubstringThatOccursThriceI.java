// Last updated: 8/6/2025, 11:04:45 AM
class Solution {
    public int maximumLength(String s) {
        int freq[][]=new int[26][s.length()+1];
        char prev=s.charAt(0);
        freq[prev-'a'][1]=1;
        int max=-1;
        int length=1;
        for(int i=1;i<s.length();i++){
            char curr=s.charAt(i);
            if(prev==curr){
                length++;
                freq[s.charAt(i)-'a'][length]++;
            }
            else{
                length=1;
                freq[s.charAt(i)-'a'][length]++;
                prev=curr;
            }
        }
        for(int i=0;i<26;i++){
            int sum=0;
            for(int j=s.length();j>=1;j--){
                sum+=freq[i][j];
                if(sum>=3)
                    max=Math.max(max,j);
            }
        }
        return max;
    }
}