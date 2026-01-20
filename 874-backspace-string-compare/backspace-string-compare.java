class Solution {
    public boolean backspaceCompare(String s, String t) {
        return op(s).equals(op(t));
    }
    public String op(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '#') {
                if (!st.isEmpty()) st.pop();
            } 
            else {
                st.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.reverse().toString(); 
    }
}
