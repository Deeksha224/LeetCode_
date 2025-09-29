// complexity O(log(m+n))
// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         int i = 0;
//         int j = matrix[0].length -1;
//         while (i < matrix.length && j >= 0){
//             if (matrix[i][j] == target){
//                 return true;
//             }
//             else if (matrix[i][j] > target){
//                 j--;
//             }
//             else{
//                 i++;
//             }
//         }
//         return false;
//     }
// }

// complexity O(log(n*m))
class Solution{
    public boolean searchMatrix(int[][] matrix, int target){
        int m = matrix.length;
        int n = matrix[0].length;
        int start = 0;
        int end = m*n-1;
        while (start <= end){
            int mid = (start+end)/2;

            int i = mid / n;
            int j = mid % n;

            if (matrix[i][j] == target){
                return true;
            }
            else if (matrix[i][j] > target){
                end = mid - 1;
            }
            else{
                start = mid +1;
            }
            
        }
        return false;
    }
}