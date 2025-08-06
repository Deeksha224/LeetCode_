// Last updated: 8/6/2025, 11:11:39 AM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length - 1;
        while (i < matrix.length && j >= 0){
            if (matrix[i][j] == target){
                return true;
            }
            else if (matrix[i][j] > target){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
}