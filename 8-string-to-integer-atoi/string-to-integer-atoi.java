class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0){
            return 0;
        }
        int i = 0;
        int sign = 1;
        if(s.charAt(0) =='+' || s.charAt(0) == '-'){
            if(s.charAt(0) == '-'){
                sign = -1;
            }
            i++;
        }

        long res = 0;
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i)-'0';
            res = res*10+digit;
            if(sign*res <= Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            if(sign*res >= Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            i++;
        }
        return (int)(res*sign);
    }
}