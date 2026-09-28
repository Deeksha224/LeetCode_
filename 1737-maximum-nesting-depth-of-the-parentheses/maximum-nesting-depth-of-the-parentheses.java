class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int ans = 0;
        for(Character ch:s.toCharArray()){
            if(ch=='('){
                st.push(ch);
            }
            else if (ch==')'){
                st.pop();
            }
            ans = Math.max(ans,st.size());
        }
        return ans;
    }
}