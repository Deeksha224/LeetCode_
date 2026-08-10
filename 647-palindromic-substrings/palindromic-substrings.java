class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                if(isPal(s.substring(i,j+1))){
                    count++;
                }
            }
        }
        return count;
    }
    public boolean isPal(String s){
        int a = 0;
        int b = s.length()-1;
        while(a<=b){
            if(s.charAt(a) != s.charAt(b)){
                return false;
            }
            a++;
            b--;
        }
        return true;
    }
}