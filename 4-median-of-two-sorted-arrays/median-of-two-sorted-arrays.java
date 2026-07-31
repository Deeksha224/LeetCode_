class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int total = m+n;
        int pre = 0;
        int cur = 0;

        int i = 0; 
        int j = 0;

        for(int count = 0; count <= total/2; count++){
            pre = cur;
            if(i < m && j < n){
                if(nums1[i] <= nums2[j]){
                    cur = nums1[i++];
                }
                else{
                    cur = nums2[j++];
                }
            }
            else if(i < m){
                cur = nums1[i++];
            }
            else{
                cur = nums2[j++];
            }
        }
        if(total%2 != 0) return cur;
        return (pre+cur)/2.0;

        
    }
}