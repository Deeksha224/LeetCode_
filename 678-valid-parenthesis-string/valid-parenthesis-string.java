class Solution {
    public boolean checkValidString(String s) {
        int open = 0;
        int close = 0;
        for(char ch : s.toCharArray()){
            if (ch =='('){
                open++;
                close++;
            }
            if(ch ==')'){
                open--;
                close--;
            }
            if(ch=='*'){
                open++;
                close--;
            }
            
            if(open < 0){
                return false;
            }
            if(close < 0){
                close = 0;
            }
        }
        return close==0;
    }
}