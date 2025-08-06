// Last updated: 8/6/2025, 11:08:15 AM
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        // int start = 0, temp = Integer.MIN_VALUE;
        // int i = 0;
        // while ( i < arr.length){
        //     temp = arr[i];
        //     if (temp > arr[i + 1]){
        //         start = i;
        //         break;
        //     }
        //     i++;
        // }
        // return start;

        // OR

         int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }
}