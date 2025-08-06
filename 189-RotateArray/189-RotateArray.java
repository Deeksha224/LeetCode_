// Last updated: 8/6/2025, 11:10:43 AM
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        Reverse (nums, 0 , n - k - 1);
        Reverse (nums, n - k, n - 1);
        Reverse (nums, 0 , n -  1);
    }
    public static void Reverse (int[] arr, int i, int j){
        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}