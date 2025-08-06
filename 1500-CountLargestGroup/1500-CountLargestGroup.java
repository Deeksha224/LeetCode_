// Last updated: 8/6/2025, 11:07:22 AM
class Solution {
    public int countLargestGroup(int n) {
        int[] freq = new int[37];
        while (n > 0){
            int sum_of_digit = count(n);
            freq[sum_of_digit]++;
            n--;
        }
        Arrays.sort(freq);
        int group = 0; 
        int max = freq[freq.length-1];
        for (int i = freq.length-1; i > 0; i--){
            if (max == freq[i]){
                group++;
            }
            else{break;}
        }
        return group;
        
    }
    // return the sum in single digit 
    public int count(int n){
        int sum = 0;
        while (n > 0){
            int temp = n % 10;
            sum += temp;
            n /= 10;
        }
        return sum;
    }
}