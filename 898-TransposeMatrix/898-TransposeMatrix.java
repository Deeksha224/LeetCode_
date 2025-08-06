// Last updated: 8/6/2025, 11:08:14 AM
class Solution {
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] mat = new int[col][row];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                mat[j][i] = matrix[i][j];
            }
        }
        return mat;
    }
}