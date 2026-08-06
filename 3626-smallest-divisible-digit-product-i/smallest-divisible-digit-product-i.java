class Solution {
    public int smallestNumber(int n, int t) {
        //System.out.println(pro(15));
        while(true){
            if(pro(n) % t != 0)
                n++;
            else{
                return n;
            }
        }
    }
    public int pro(int n){
        int ans = 1;
        while(n>0){
            int temp = n%10;
            ans*=temp;
            n/=10;
        }
        return ans;
    }
}