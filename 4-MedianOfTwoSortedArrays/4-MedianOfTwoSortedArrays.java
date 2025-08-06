// Last updated: 8/6/2025, 11:12:56 AM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double[] arr = new double[nums1.length + nums2.length];
        double ans = 0;
        for (int i = 0; i < nums1.length; i++){
            arr[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++){
            arr[nums1.length + i] = nums2[i];
        }
        Arrays.sort(arr);
        int n = (arr.length -1) / 2;
        if (arr.length % 2 == 0){
            ans = (double)(arr[n] + arr[n+1]) / 2;
        }
        else{
            ans = arr[n];
        }
        return ans;
    }
}