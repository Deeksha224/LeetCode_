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

// class Solution {
//     public int[] maxSlidingWindow(int[] nums, int k) {
//         int ans[] = new int[nums.length-k+1];
//         int p=0;
//         Deque<Integer> dq = new ArrayDeque<>(); // this will store indexes
//         for(int i=0;i<nums.length;i++){
//             if(!dq.isEmpty() && dq.peekFirst() <= i-k){
//                 dq.pollFirst();
//             }

//             while(!dq.isEmpty() && nums[i]>=nums[dq.peekLast()]){
//                 dq.pollLast();
//             }

//             dq.offerLast(i);

//             if(i >= k-1){ // for first window only
//                 ans[p++]=nums[dq.peekFirst()];
//             }
//         }
//         return ans; 
//     }
// }


class Solution{
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length-k+1];
        int[] pmax = new int[nums.length];
        int[] smax = new int[nums.length];
        pmax[0] = nums[0];
        for (int i = 1; i < nums.length; i++){
            if (i % k == 0){
                pmax[i] = nums[i];
            }
            else{
                pmax[i] = Math.max(pmax[i-1],nums[i]);
            }
        }
        smax[nums.length-1] = nums[nums.length-1];
        for (int i = nums.length-2; i >=0; i--){
            if ((i+1) % k == 0){
                smax[i] = nums[i];
            }
            else{
                smax[i] = Math.max(smax[i+1],nums[i]);
            }
        }
        for (int i = 0; i < ans.length; i++){
            ans[i] = Math.max(smax[i],pmax[i+k-1]);
        }
        return ans;
    }
}