class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int count = 0;
        int[] temp = new int[rocks.length];
        for (int i = 0; i < rocks.length; i++){
            temp[i] = capacity[i] - rocks[i];
        }
        Arrays.sort(temp);
        for (int i = 0; i < rocks.length; i++){
            if (additionalRocks >= temp[i]){
                additionalRocks -= temp[i];
                count++;
            }
        }
        return count;
    }
}