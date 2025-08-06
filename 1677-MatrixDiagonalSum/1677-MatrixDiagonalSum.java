// Last updated: 8/6/2025, 11:06:55 AM
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int s = 0;
        int e = mat.length - 1;
        for (int i = 0; i < mat.length; i++){
            sum = sum + mat[i][s] + mat[i][e];
            if (s == e){
                sum -= mat[i][s];
            }
            s++;
            e--;
        }
        return sum;
    }
}