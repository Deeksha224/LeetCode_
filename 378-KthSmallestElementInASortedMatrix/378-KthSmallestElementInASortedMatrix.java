// Last updated: 8/6/2025, 11:09:36 AM
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] arr = new int[m*n];
        int l = 0;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                arr[l] = matrix[i][j];
                l++;
            }
        }
        Arrays.sort(arr);
        return arr[k - 1];
    }
}