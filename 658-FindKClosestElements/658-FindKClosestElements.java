// Last updated: 8/6/2025, 11:08:38 AM
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int start = 0;
        int end = arr.length - 1;
        while (end - start >= k){
            if (Math.abs(arr[start] - x) > Math.abs(arr[end] - x)){
                start++;
            }
            else{
                end--;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>(k);
        for (int i = start; i <= end; i++){
            ans.add(arr[i]);
        }
        return ans;
    }
}