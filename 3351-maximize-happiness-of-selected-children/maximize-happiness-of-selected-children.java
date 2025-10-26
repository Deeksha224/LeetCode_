class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long ans = 0;
        int count = 0;
        for (int i = happiness.length-1; i >= 0; i--){
            if (k > 0 && happiness[i] - count >= 0){
                ans = ans + happiness[i] - count;
            }
            count++;
            k--;
        }
        return ans;
    }
}