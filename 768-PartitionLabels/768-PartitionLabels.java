// Last updated: 8/6/2025, 11:08:25 AM
class Solution {

    public List<Integer> partitionLabels(String s) {
        // Stores the last index of each character in 's'
        int[] last = new int[26];
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }
        int end = 0, start = 0;
        List<Integer> sizes = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end,last[s.charAt(i) - 'a']);
            // End of the current partition
            if (i == end) {
                sizes.add(i - start + 1);
                start = i + 1;
            }
        }
        return sizes;
    }
}