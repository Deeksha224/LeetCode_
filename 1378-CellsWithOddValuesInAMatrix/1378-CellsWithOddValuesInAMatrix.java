// Last updated: 8/6/2025, 11:07:39 AM
class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int [][] matrix = new int[m][n];
        int num = 0;
        for (int[] index : indices){
            int row = index[0];
            int col = index[1];
        for (int j = 0; j < n; j++){
            matrix[row][j]++;
        }
        for (int i = 0; i < m; i++){
            matrix[i][col]++;
        }
        }
        for (int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if (matrix[i][j] % 2 !=0){
                num +=1;
            }
            }
        }
        return num;
    }
}