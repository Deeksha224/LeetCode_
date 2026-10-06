class Solution {
    public int minAddToMakeValid(String s) {
        if(s.length()== 0) return 0;
        int ob = 0;
        int req = 0;

        for(char c : s.toCharArray()){
            if(c=='('){
                ob++;
            }
            else{
                if(ob > 0){
                    ob--;
                }
                else{
                    req++;
                }
            }
        }
        return ob+req;
    }
}