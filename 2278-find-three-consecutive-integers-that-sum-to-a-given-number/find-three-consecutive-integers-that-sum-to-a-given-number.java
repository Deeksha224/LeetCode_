class Solution {
    public long[] sumOfThree(long num) {
        long ans = num - 3;
        long temp = 0;
        if (ans % 3 == 0){
            temp = ans / 3;
        }
        long[] newarr = new long[0];
        long[] arr = new long[3];
        arr[0] = temp;
        arr[1] = temp+1;
        arr[2] = temp+2;
        if (3*temp+3 == num){
            return arr;
        }
        return newarr;
    }
}