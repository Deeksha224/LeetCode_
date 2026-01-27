class Solution {
    public int timeRequiredToBuy(int[] ticket, int k) {
        int count = 0;
        int range = ticket[k];
        for (int i = 0; i < ticket.length; i++){
            if (i<=k){
                count += Math.min(range,ticket[i]);
            }
            else{
                count += Math.min(range-1,ticket[i]);
            }
        }
        return count;
    }
}