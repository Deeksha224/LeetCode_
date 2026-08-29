class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        // Make a sorted copy
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        // Store groups
        List<List<Integer>> groups = new ArrayList<>();

        List<Integer> group = new ArrayList<>();
        group.add(sorted[0]);

        for (int i = 1; i < n; i++) {

            if (sorted[i] - sorted[i - 1] <= limit) {
                group.add(sorted[i]);
            } else {
                groups.add(group);
                group = new ArrayList<>();
                group.add(sorted[i]);
            }
        }

        groups.add(group);

        // Map each value to its group
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < groups.size(); i++) {
            for (int x : groups.get(i)) {
                map.put(x, i);
            }
        }

        // Pointers to smallest unused value in each group
        int[] index = new int[groups.size()];

        // Replace each element with the smallest
        // available element from its group
        for (int i = 0; i < n; i++) {
            int groupNo = map.get(nums[i]);

            nums[i] = groups.get(groupNo).get(index[groupNo]);
            index[groupNo]++;
        }
        

        return nums;
    }
}