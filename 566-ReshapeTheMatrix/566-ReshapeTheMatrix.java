// Last updated: 8/6/2025, 11:08:51 AM
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] arr = new int[r][c];
        int[] arr1 = new int[r * c];
        for (int k = 0; k < mat.length; k++){
            if (mat.length * mat[k].length != r * c){
                arr = mat;
            }
            else{
                int s = 0;
                for (int i = 0; i < mat.length; i++){
                    for (int j = 0; j < mat[i].length; j++){
                        arr1[s] = mat[i][j];
                        s++;
                    }
                }
                s = 0;
                for(int x = 0; x < r; x++){
                    for (int y = 0; y < c ; y++){
                        arr[x][y] = arr1[s];
                        s++;
                    }
                }
            }
        }
        return arr;
    }
}