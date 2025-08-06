// Last updated: 8/6/2025, 11:04:53 AM
class Solution {
    public int differenceOfSums(int n, int m) {
        int num = 0 ;
        while (n > 0){
            if (n%m == 0){
                num -= n;
            }
            else{
                num += n;
            }
            n--;
        }
        return num;
    }
}