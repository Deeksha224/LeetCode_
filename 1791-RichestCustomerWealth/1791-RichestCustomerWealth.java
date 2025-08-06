// Last updated: 8/6/2025, 11:06:52 AM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++){
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++){
                sum += accounts[i][j];
            }
            if (sum > max){
                max = sum;
            }
        }
        return max;
    }
}