// Last updated: 8/6/2025, 11:05:27 AM
class Solution {
    public int longestNiceSubarray(int[] nums) {
        int ans = 1;
        int left = 0;
        int right = 0;
        int use_bits = 0; //recording each bit
        while (right < nums.length){
            while ((use_bits & nums[right]) != 0){
                use_bits ^= nums[left]; // if bit is already present XOR to remove 
                left++;
            }
            use_bits |= nums[right]; // bit not present add(OR) it to use_bit and update the ans
            ans = Math.max(ans,right-left+1);
            right++;
        }
        return ans;
    }
}