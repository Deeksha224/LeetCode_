import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        // Compute next greater for nums2
        for (int i = nums2.length - 1; i >= 0; i--) {
            int curr = nums2[i];

            while (!st.isEmpty() && st.peek() <= curr) {
                st.pop();
            }

            map.put(curr, st.isEmpty() ? -1 : st.peek());
            st.push(curr);
        }

        //Answer queries for nums1
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        } 
        return ans;
    }
}
