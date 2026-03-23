class Solution {
    public int maxSum(int[] nums1, int[] nums2) {
        long mod = 1000000007;
        int i = nums1.length-1; 
        int j = nums2.length-1;
        long s1 = 0; 
        long s2 = 0;
        long ans = 0;
        while(i>=0 && j>=0){
            if(nums1[i] == nums2[j]){
                ans+=Math.max(s1,s2)+nums1[i];
                s1 = 0;
                s2 = 0;
                i--;
                j--;
            }
            else if(nums1[i] > nums2[j]){
                s1+=nums1[i];
                i--;
            }
            else{
                s2+=nums2[j];
                j--;
            }
        }
        while(i>=0){
            s1+=nums1[i--];
        }
        while(j>=0){
            s2+=nums2[j--];
        }
        ans += Math.max(s1,s2);
        return (int)(ans%mod);
    }
}