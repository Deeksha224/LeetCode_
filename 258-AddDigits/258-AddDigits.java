// Last updated: 8/6/2025, 11:10:05 AM
class Solution {
    public int addDigits(int num) {
        int ans = sum1(num);
        
        while (ans > 9){
            ans = sum1(ans);
        }
        return ans;
    }
    public static int sum1 (int num){
        int add = 0;
        while (num > 0){
            int temp = num % 10;
            add += temp;
            num /= 10;
        }
        return add;
    }
}