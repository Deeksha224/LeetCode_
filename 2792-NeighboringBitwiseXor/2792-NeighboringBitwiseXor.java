// Last updated: 8/6/2025, 11:05:02 AM
class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int sumXOR = derived[0];
        for (int i = 1; i < derived.length; i++){
            sumXOR ^= derived[i];
        }
        return sumXOR == 0;
    }
}