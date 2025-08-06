// Last updated: 8/6/2025, 11:12:53 AM
class Solution {
    public int reverse(int x) {
        long temp = 0;
        int r = Math.abs(x);
        while (r>0){
            int c = r % 10;
            temp = temp * 10 + c;
            r /= 10;
        }
        if (temp > 2147483646 ){
            return 0;
        }
        if (x < 0){
            temp = temp * -1;
        }
        int temp1 = (int) temp;
        return temp1;
    }
}