// Last updated: 8/6/2025, 11:09:10 AM
class Solution {
    public int findPairs(int[] nums, int k) {
        if (k == 0) {
            // Special case: count elements that appear more than once
            Map<Integer, Integer> freq = new HashMap<>();
            int count = 0;
            for (int num : nums) {
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }
            for (int val : freq.values()) {
                if (val > 1) count++;
            }
            return count;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums){
            set.add(num);
        }
        ArrayList<Integer> l = new ArrayList<>(set);
        int count = 0;
        for (int i = 0; i < l.size(); i++){
            for (int j = i+1; j < l.size(); j++){
                if (Math.abs(l.get(i)-l.get(j)) == k){
                    count++;
                }
            }
        }
        return count;
    }
}