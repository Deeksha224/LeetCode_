class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < nums.length; i++){
            while (!st.isEmpty() && st.peek() > nums[i] && (st.size() + (nums.length - i)) > k){
                st.pop();
            }
            
            if (st.size() < k){
                st.push(nums[i]);
            }
        }
       
        int[] arr = new int[k];
        for (int i = k-1; i >= 0; i--){
            arr[i] = st.pop();
        }   
        return arr;
    }
}