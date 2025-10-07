class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> st = new Stack<>();
        for (String str : tokens){
            if (str.equals("+")){
                st.push(st.pop() + st.pop());
            }
            else if (str.equals("-")){
                int temp = st.pop();
                st.push(st.pop() - temp);
            }
            else if (str.equals("*")){
                st.push(st.pop() * st.pop());
            }
            else if (str.equals("/")){
                int temp = st.pop();
                st.push(st.pop() / temp);
            }
            else{
                st.push(Integer.parseInt(str));
            }

        }
        return st.pop();
    }
}