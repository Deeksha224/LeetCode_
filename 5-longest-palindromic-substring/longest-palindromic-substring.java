class Solution {
    public String longestPalindrome(String s) {
        if(s.length() <=1){
            return s;
        }
        int maxLen = 1;
        String ans = s.substring(0,1);

        for(int i = 0; i < s.length(); i++){
            for(int j = i+maxLen; j <= s.length(); j++){
                if(isPallindrome(s.substring(i,j))){
                    maxLen = j-i;
                    ans = s.substring(i,j);
                }
            }
        }
        return ans;
        
    }
    public boolean isPallindrome (String s){
        int i = 0;
        int j = s.length()-1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}