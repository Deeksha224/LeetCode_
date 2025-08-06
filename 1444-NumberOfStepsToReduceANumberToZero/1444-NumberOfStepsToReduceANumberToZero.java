// Last updated: 8/6/2025, 11:07:31 AM
class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        return number(num,count);
    }
    static int number(int num, int count){
        // Base condition
        if (num == 0){
            return count;
        }
        if (num % 2 == 0){
            num /= 2;
            count++;
        }
        else{
            num -= 1;
            count++;
        }
        return number(num,count);
    }
}