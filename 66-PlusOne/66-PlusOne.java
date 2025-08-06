// Last updated: 8/6/2025, 11:11:46 AM
class Solution {
    public int[] plusOne(int[] d) {
        for (int i = d.length - 1; i > -1; i--){
            if (d[i] < 9){
                d[i]++;
                return d;
            }
            d[i] = 0;
        }
        d = new int[d.length + 1];
        d[0] = 1;
        return d;
    }
}