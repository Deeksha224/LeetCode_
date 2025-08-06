// Last updated: 8/6/2025, 11:04:01 AM
class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        int[] freq = new int[101];
        for (int num : nums) {
            freq[num]++;
        }
        for (int f : freq) {
            if (isPrime(f)) {
                return true;
            }
        }
        return false;
    }
    public static boolean isPrime(int n) {
        if (n <= 1) return false; 
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false; 
            }
        }
        return true;
    }
}
