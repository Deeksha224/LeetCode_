class Solution {
    public int maxPower(String s) {
        int ans = 1;
        int count = 1;
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length - 1; i++){
            if(ch[i] == ch[i+1]){
                count++;
            }
            else{
                ans = Math.max(ans,count);
                count = 1;
            }
        }
        ans = Math.max(ans,count);
        return ans;
    }
}