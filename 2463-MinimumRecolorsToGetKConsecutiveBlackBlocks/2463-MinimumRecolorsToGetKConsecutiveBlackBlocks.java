// Last updated: 8/6/2025, 11:05:32 AM
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left = 0;
        int white = 0;
        int change = Integer.MAX_VALUE;
        for (int right = 0; right < blocks.length(); right++){
            if (blocks.charAt(right) == 'W'){
                white++;
            }
            // if window size is k 
            if (right - left + 1 == k){
                // get the minimum 
                change = Math.min(change,white);
                // check for more
                if (blocks.charAt(left) == 'W'){
                    white--;
                }
                left++;
            }
        }
        return change;
    }
}