// Last updated: 8/6/2025, 11:07:29 AM
class Solution {
    public boolean checkIfExist(int[] arr) {
        for (int  i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (arr[i] == (2 * arr[j]) && i != j){
                    return true;
                }
            }
        }
        return false;
    }
}