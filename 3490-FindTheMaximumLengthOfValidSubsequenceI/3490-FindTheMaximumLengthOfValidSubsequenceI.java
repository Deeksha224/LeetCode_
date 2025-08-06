// Last updated: 8/6/2025, 11:04:34 AM
class Solution {
    public int maximumLength(int[] nums) {
        int evenCount = 0;
        int oddCount = 0;
        int altEven = 0;
        int altOdd = 0;
        for (int num : nums){
            int temp = num % 2;
            if (temp == 0){
                evenCount++;
                altEven = altOdd + 1;
            }
            else{
                oddCount++;
                altOdd = altEven + 1;
            }
        }
        return Math.max(Math.max(evenCount,oddCount),Math.max(altEven,altOdd));
    }
}