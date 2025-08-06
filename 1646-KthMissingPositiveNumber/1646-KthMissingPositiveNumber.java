// Last updated: 8/6/2025, 11:07:01 AM
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int j = 1;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != j){
                k--;
                if (k == 0){
                    return j;
                }
                i--;
            }
            j++;
        }
        return arr[arr.length - 1] + k;
    }
}