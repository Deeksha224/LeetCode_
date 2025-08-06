// Last updated: 8/6/2025, 11:07:43 AM
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 != 0){
                count++;
            }
            else {
                count = 0;
            }
             if (count > 2){
                break;
            } 
        }
        return count > 2;
    }
}