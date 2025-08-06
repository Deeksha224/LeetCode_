// Last updated: 8/6/2025, 11:05:11 AM
class Solution {

    public int longestSquareStreak(int[] nums) {
        int ans = 0;

        // Create a Set to store all unique numbers from the input array
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        // Iterate through each number in the input array
        for (int num : nums) {
            int count = 0;
            long current = num;

            // Continue the streak as long as we can find the next square in the set
            while (set.contains((int) current)) {
                count++;

                // Break if the next square would be larger than 10^5 (problem constraint)
                if (current * current > 1e5) break;

                current *= current;
            }

            // Update the longest streak if necessary
            ans = Math.max(ans, count);
        }

        // Return -1 if no valid streak found, otherwise return the longest streak
        return ans < 2 ? -1 : ans;
    }
}