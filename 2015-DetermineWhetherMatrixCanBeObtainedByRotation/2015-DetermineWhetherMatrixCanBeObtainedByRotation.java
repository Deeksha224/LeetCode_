// Last updated: 8/6/2025, 11:06:31 AM
class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int a = 0, b = 0, c = 0, d = 0;
        int n = mat.length;
        for(int i = 0; i< n; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j] == target[n - j - 1][i]){
                    a++;
                }
                if(mat[i][j] == target[n - i - 1][n - j - 1]){
                    b++;
                }
                if(mat[i][j] == target[j][n - i - 1]){
                    c++;
                }
                if(mat[i][j] == target[i][j]){
                    d++;
                }
            }
        }
        
        if (a == n*n || b == n*n || c == n*n || d == n*n )
        return true;
        else return false;
    }
}