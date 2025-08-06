// Last updated: 8/6/2025, 11:09:47 AM
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //Count frequency to support negative numbers
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        //Store number and its frequency in a 2D array
        int[][] val = new int[freq.size()][2];
        int i = 0;
        for (HashMap.Entry<Integer, Integer> map : freq.entrySet()) {
            val[i][0] = map.getKey();     // number
            val[i][1] = map.getValue();   // frequency
            i++;
        }

        //Sort by frequency in descending order
        Arrays.sort(val, (a, b) -> b[1] - a[1]);

        //Collect top k frequent numbers
        int[] ans = new int[k];
        for (int j = 0; j < k; j++) {
            ans[j] = val[j][0];
        }

        return ans;
    }
}