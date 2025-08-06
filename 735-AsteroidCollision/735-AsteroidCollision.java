// Last updated: 8/6/2025, 11:08:33 AM
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for (int asteroid : asteroids){
            if (asteroid > 0){
                st.push(asteroid);
            }
            else{
                while (!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(asteroid)){
                    st.pop();
                }
                if(!st.isEmpty() && st.peek() == Math.abs(asteroid)){
                    st.pop();
                }
                else if (st.isEmpty() || st.peek() < 0){ 
                    st.push(asteroid);
                }
            }
        }
        int[] ans = new int[st.size()];
        for (int i = ans.length - 1; i >=0; i--){
            ans[i] = st.pop();
        }
        return ans;
    }
}