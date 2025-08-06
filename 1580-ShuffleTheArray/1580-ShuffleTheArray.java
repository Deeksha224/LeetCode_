// Last updated: 8/6/2025, 11:07:11 AM
class Solution {
    public int[] shuffle(int[] nums, int n) {
       int[] result = new int [nums.length];
       int index  = 0;
       int arr1 = 0;
       int arr2 = n;
       while (arr2 != 2*n){
            result[index++] = nums[arr1];
            result[index++] = nums[arr2];
            arr1++;
            arr2++;
        } 
    return result;
    }
}