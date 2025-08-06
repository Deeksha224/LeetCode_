// Last updated: 8/6/2025, 11:07:56 AM
class Solution {
    public int minIncrementForUnique(int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] == arr[i+1]){
                arr[i+1]++;
                count++;
            }
            if (arr[i] > arr[i+1]){
                int sub = arr[i] - arr[i+1] + 1;
                arr[i + 1] += sub ;
                count = count + sub;
            }
        }
        return count;
    }
}