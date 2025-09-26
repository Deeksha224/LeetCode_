//  tc = O(n*k)
// class Solution {
//     public int[] maxSlidingWindow(int[] nums, int k) {
//         int i = 0;
//         ArrayList<Integer> l = new ArrayList<>();
//         while ( i < nums.length - k+1){
//             l.add(findMax(i,i+k,nums));
//             i++;
//         }
//         int n = l.size();
//         int[] arr = new int[n];
//         for (int j = 0; j < n; j++){
//             arr[j] = l.get(j);
//         }
//         return arr;
//     }
//     public int findMax (int start, int end, int[] nums){
//         int max = Integer.MIN_VALUE;
//         for (int i = start; i < end; i++){
//             max = Math.max(max,nums[i]);
//         }
//         return max;
//     }
// }

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int ans[] = new int[nums.length-k+1];
        int p=0;
        Deque<Integer> dq = new ArrayDeque<>(); // this will store indexes
        for(int i=0;i<nums.length;i++){
            if(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.pollFirst();
            }

            while(!dq.isEmpty() && nums[i]>=nums[dq.peekLast()]){
                dq.pollLast();
            }

            dq.offerLast(i);

            if(i>=k-1){ // for first window only
                ans[p++]=nums[dq.peekFirst()];
            }
        }

        return ans; 
    }
}