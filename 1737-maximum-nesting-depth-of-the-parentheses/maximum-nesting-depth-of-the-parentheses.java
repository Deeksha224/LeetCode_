class Solution {
    public int maxDepth(String s) {
        // Stack<Character> st = new Stack<>();
        // int ans = 0;
        // for(Character ch:s.toCharArray()){
        //     if(ch=='('){
        //         st.push(ch);
        //     }
        //     else if (ch==')'){
        //         st.pop();
        //     }
        //     ans = Math.max(ans,st.size());
        // }
        // return ans;
        int ans = 0;
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(') ans++;
            else if(s.charAt(i) == ')') ans--;
            max = Math.max(max,ans);
        }
        return max;
    }
}