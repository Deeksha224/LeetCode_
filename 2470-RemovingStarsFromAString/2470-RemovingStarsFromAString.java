// Last updated: 8/6/2025, 11:05:31 AM
class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i++){
            if (ch[i] == '*'){
                st.pop();
            }
            else{
                st.push(ch[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();

        return sb.toString();
    }
}