class Solution {
    public boolean isPerfectSquare(int num) {
        long min = 0;
        long hi = num;
        while (min <= hi){
            long mid = min +(hi-min)/2;

            if (mid*mid == num){
                return true;
            }
            else if ((mid*mid) > num){
                hi = mid - 1;
            }
            else{
                min = mid+1;
            }
        }
        return false;
    }
}