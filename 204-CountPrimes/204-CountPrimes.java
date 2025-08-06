// Last updated: 8/6/2025, 11:10:37 AM
class Solution {
    public int countPrimes(int n) {
       if (n <= 2){
        return 0;
       } 
       return prime_sieve(n);
    }
    public static int prime_sieve (int n){
        int count_prime = 0;
        int[] ans = new int[n];
        ans[0] = ans[1] = 1; // converting index 0 and 1 as non prime
        for (int i = 2; i * i <= ans.length; i++){
            if (ans[i] == 0){ // i is prime
                for (int j = 2; i*j < ans.length; j++){
                    ans [i*j] = 1;
                }
            }
        }
        for (int i = 0; i < n; i++){
            if (ans[i] == 0){
                count_prime++;
            }
        }
        return count_prime;
    }
}