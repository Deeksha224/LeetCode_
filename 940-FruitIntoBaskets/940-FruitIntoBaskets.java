// Last updated: 8/6/2025, 11:08:06 AM
class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0, maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int right = 0; right < fruits.length; right++) {
            // Add current fruit to the map
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            // Shrink the window until we have at most 2 types
            while (map.size() > 2) {
                map.put(fruits[left], map.get(fruits[left]) - 1);
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
