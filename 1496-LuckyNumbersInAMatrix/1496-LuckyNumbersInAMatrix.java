// Last updated: 8/6/2025, 11:07:25 AM
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> luckyNumbers = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int minRowValue = Integer.MAX_VALUE;
            int minRowIndex = -1;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < minRowValue) {
                    minRowValue = matrix[i][j];
                    minRowIndex = j;
                }
            }
            boolean isLucky = true;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][minRowIndex] > minRowValue) {
                    isLucky = false;
                    break;
                }
            }
            
            if (isLucky) {
                luckyNumbers.add(minRowValue);
            }
        }
        return luckyNumbers;
    }
}