// Last updated: 8/6/2025, 11:09:32 AM
class Solution {
    public int findNthDigit(int n) {
        if(1>n || n>Integer.MAX_VALUE)
        {
            return 0;
        }
        long start=1;
        long count=9;
        int digit=1;
        while(n>digit*count)
        {
            n -=digit*count;
            count *=10;
            digit++;
            start *=10;
        }
        long num= start+ (n-1)/digit;
        String str= Long.toString(num);
        return str.charAt((n-1)%digit) -'0';
    }
}