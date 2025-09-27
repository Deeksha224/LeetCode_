class Solution {
    public long kMirror(int k, int n) {
        int L = 1;
        long sum = 0L;
        while (n > 0) {
            int half = (L + 1) / 2;
            int min = (int)Math.pow(10, half - 1);
            int max = (int)Math.pow(10, half) - 1;

            for (int i = min; i <= max && n > 0; i++) {
                long num;
                if (L % 2 == 0) { // even length palindrome
                    num = (long)i * (long)Math.pow(10, half) + reverse(i);
                } 
                else { // odd length palindrome
                    num = (long)i * (long)Math.pow(10, half - 1) + reverse(i / 10);
                }

                // check if base-k representation is palindrome
                if (stringPalindrome(baseConverter(num, k))) {
                    sum += num;
                    n--;
                }
            }
            L++; // move to next length
        }
        return sum;
    }

    public long reverse(long n) {
        long ans = 0;
        while (n > 0) {
            ans = ans * 10 + n % 10;
            n /= 10;
        }
        return ans;
    }

    // Convert number to base-k string
    public String baseConverter(long num, int k) {
        StringBuilder s = new StringBuilder();
        while (num > 0) {
            s.append(num % k);
            num /= k;
        }
        return s.reverse().toString();
    }

    // Check if a string is a palindrome
    public boolean stringPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
