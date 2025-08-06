// Last updated: 8/6/2025, 11:05:03 AM
class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int[] row = new int[mat.length];
        int[] col = new int[mat[0].length];
        int[][] pos = new int[mat.length * mat[0].length + 1][2];
        for(int i=0 ; i<mat.length ; i++){
            for(int j=0 ; j<mat[0].length ; j++){
                pos[mat[i][j]][0] = i;
                pos[mat[i][j]][1] = j;
            }
        }
        for(int i=0 ; i<arr.length ;i++){
            int j = pos[arr[i]][0];
            int k = pos[arr[i]][1];
            row[j]++;
            if(row[j]==mat[0].length){
                return i;
            }
            col[k]++;
            if(col[k]==mat.length){
                return i;
            }
        }
        return arr.length;
    }
}