// Last updated: 8/6/2025, 11:03:58 AM
class Solution {
    public int maxBalancedShipments(int[] weight) {
        int max=Integer.MIN_VALUE;
        int c=0;
        for(int i=0 ; i<weight.length ; i++){
            max = Math.max(max,weight[i]);
            if(weight[i]<max){
                c++;
                max=Integer.MIN_VALUE;
            }
        }
        return c;
    }
}