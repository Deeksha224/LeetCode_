// Last updated: 8/6/2025, 11:10:39 AM
class Solution {
    public boolean isHappy(int n) {
        // int rem=0;
        // int num=0;
        // int c=0;
        // while(num!=1){
        //     while(n>0){
        //         rem = n%10;
        //         num = num+(rem*rem);
        //         n=n/10;
        //     }
        //     if(c>10)
        //     return num==1;
        //     n = num;
        //     num = 0;
        //     c++;
        // }
        // return num==1;


        // using linked list
        int slow = n;
        int fast = n;
        do {
            slow = findsquare(slow);
            fast = findsquare(findsquare(fast));
        }
        while (slow != fast);{
            if (slow == 1){
                return true;
            }
        }
        return false;

    }
    public static int findsquare(int n){
        int ans = 0;
        while (n > 0){
            int rem = n%10;
            ans += (rem*rem);
            n=n/10;
        }
        return ans;
    }
}