// Last updated: 8/6/2025, 11:05:29 AM
class Solution {
    public int maximumSum(int[] nums) {
        Arrays.sort(nums);
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            arr[i] = sum_of_digit(nums[i]);
        }
        int max = -1;
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    max = Math.max(max,nums[i] + nums[j]);
                    break;
                }
            }
        }
        return max;

    }
    public static int sum_of_digit (int n){
        int sum = 0;
        while (n > 0){
            int temp = n % 10;
            sum += temp;
            n /=10;
        }
        return sum;
    }
}