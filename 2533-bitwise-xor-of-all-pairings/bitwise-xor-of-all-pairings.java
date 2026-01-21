class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int xor1 = nums1[0], xor2 = nums2[0];
        int n = nums1.length, m = nums2.length;
        if(n%2==0 && m%2==0) return 0;
        for (int i = 1; i < nums1.length; i++){
            xor1^= nums1[i];
        }
        for (int i = 1; i < nums2.length; i++){
            xor2^= nums2[i];
        }
        if(nums1.length%2==0) return xor1;
        if(nums2.length%2==0) return xor2;
        return xor1^xor2;
    }
}