class Solution {
    public int reverseDegree(String s) {
        int pro = 0;
        for(int i = 1; i<= s.length(); i++){
            pro += (26-(s.charAt(i-1) -'a')) * i;
        }
        return pro;
    }
}