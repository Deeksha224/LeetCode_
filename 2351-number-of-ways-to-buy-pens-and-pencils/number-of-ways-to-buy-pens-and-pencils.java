class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        int max = Math.max(cost1, cost2);
        int min = Math.min(cost1, cost2);
        long count = 0;
        // Loop over items of max
        for (int i = 0; i * max <= total; i++) {
            int remain = total - (i * max);
            // Max number of min items we can buy with remain
            int ways = (remain / min) + 1;
            count += ways;
        }
        return count;
    }
}