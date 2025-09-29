class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        if (a.length > b.length){
            int[] temp = a ;
            a = b; 
            b = temp;
        }

        int start = 0;
        int end = a.length;
        int total = a.length+b.length;
        int half = (total+1)/2;

        while (start <= end){
            int al = (start + end)/2; // a left
            int bl = half - al; // b left
            int alm1 = (al == 0) ? Integer.MIN_VALUE: a[al-1]; // a left min -1
            int aleft = (al == a.length) ? Integer.MAX_VALUE : a[al]; //a left
            int blm1 = (bl == 0) ? Integer.MIN_VALUE: b[bl - 1]; // b rleft min -1
            int bleft = (bl == b.length) ? Integer.MAX_VALUE : b[bl]; // b left


            if (alm1 <= bleft && blm1 <= aleft){
                double ans;
                if (total % 2 == 0){
                    ans = (Math.max(alm1,blm1) + Math.min(aleft,bleft))/2.0;
                }
                else{
                    ans = Math.max(alm1,blm1)/1.0;
                }
                return ans;
            }
            else if (alm1 > bleft) {
                end = al - 1;   // move left
            }
            else {
                start = al + 1; // move right
            }

        } 
        return -1;
    }
}