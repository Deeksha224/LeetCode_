// Last updated: 8/6/2025, 11:09:16 AM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int[] arr = new int[n];
        for (int i = 0; i < nums.length; i++){
            arr[i] = -1;
        }

        for (int i = 0; i < 2*n; i++){
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % n]){
                arr[stack.pop()] = nums[i%n];
            }
            if (i < n){
                stack.push(i);
            }
        }
        return arr;

    }
}