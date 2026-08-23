class Solution {
    public boolean checkDivisibility(int n) {
        int pro = 1;
        int sum = 0;
        int clone = n;
        while(clone > 0){
            int temp = clone % 10;
            pro *= temp;
            sum += temp;
            clone /= 10;
        }
        int div = pro+sum;
        if(n%div==0) return true;
        return false;
        
    }

}