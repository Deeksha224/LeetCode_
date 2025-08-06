// Last updated: 8/6/2025, 11:08:41 AM
class Solution {
    public boolean judgeSquareSum(int c) {
        // int start = 0;
        // int end = (int) Math.sqrt(c);
        // while (start <= end){
        //     if (Math.pow(start,2) + Math.pow(end,2) == c){
        //         return true;
        //     }
        //     else if (Math.pow(start,2) + Math.pow(end,2) < c){
        //         start++;
        //     }
        //     else{
        //         end--;

        //     }
        // }
        // return false;
        for (long a = 0; a*a <= c; a++){
            double b = Math.sqrt(c - a*a);
            if (b == (int)b){
                return true;
            }
        }
        return false;
    }
}