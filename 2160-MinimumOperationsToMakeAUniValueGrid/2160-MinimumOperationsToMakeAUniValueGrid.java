// Last updated: 8/6/2025, 11:06:18 AM
class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length, n = grid[0].length;
        int k = m * n;
        int count = 0;
        int[] arr = new int[k];
        int index = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[index++] = grid[i][j];
            }
        }

        Arrays.sort(arr);
        int mid = k / 2;
        int median = arr[mid];

        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            if (Math.abs(value - median) % x != 0) {
                return -1;
            }
            count += Math.abs(value - median) / x;
        }
        return count;
    }
}