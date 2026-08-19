class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        // Initially, every row can have 2 families
        int ans = n * 2;

        // Store reserved seats row-wise
        Map<Integer, Set<Integer>> map = new HashMap<>();

        for (int[] seat : reservedSeats) {
            map.computeIfAbsent(seat[0], k -> new HashSet<>())
               .add(seat[1]);
        }

        // Only process rows having reserved seats
        for (int row : map.keySet()) {

            Set<Integer> reserved = map.get(row);

            // Check the three possible groups
            boolean left = true;    // seats 2-5
            boolean middle = true;  // seats 4-7
            boolean right = true;   // seats 6-9

            for (int seat : reserved) {

                if (seat >= 2 && seat <= 5)
                    left = false;

                if (seat >= 4 && seat <= 7)
                    middle = false;

                if (seat >= 6 && seat <= 9)
                    right = false;
            }

            // This row was counted as 2 initially
            // Now adjust according to available groups
            if (left && right) {
                // Still 2 families
            } 
            else if (left || middle || right) {
                ans--;  // Only 1 family
            } 
            else {
                ans -= 2; // No family
            }
        }

        return ans;
    }
}