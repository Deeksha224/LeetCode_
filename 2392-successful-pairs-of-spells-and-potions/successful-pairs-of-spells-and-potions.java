class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] result = new int[spells.length];
        Arrays.sort(potions);
        
        for (int i = 0; i < spells.length; i++) {
            int left = 0;
            int right = potions.length - 1;
            int j = potions.length;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if ((long) spells[i] * potions[mid] >= success) {
                    j = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            result[i] = potions.length - j;
        }

        return result;
    }
}