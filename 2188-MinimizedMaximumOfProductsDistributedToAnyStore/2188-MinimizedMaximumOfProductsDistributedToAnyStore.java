// Last updated: 8/6/2025, 11:06:16 AM
class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
     int start = 0;
        int end = maximum(quantities);
        int ans = -1;
        while (start <= end){
            int mid = (start + end) / 2;
            if (isPossible (mid, quantities, n)){
                ans = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;   
    }

    public static int maximum (int[] q){
        int a = q[0];
        for (int i = 1; i < q.length; i++){
            if (a < q[i]){
                a = q[i];
            }
        }
        return a;
    }

    public boolean isPossible (int mid, int[] quantities, int n){
        if (mid == 0){
            return false;
        }
        int store = 0;
        for (int i = 0; i < quantities.length; i++){
            store += (int) Math.ceil((double) quantities[i] / mid);
            if (store > n){
                return false;
            }
        }
        return true;
    }
}