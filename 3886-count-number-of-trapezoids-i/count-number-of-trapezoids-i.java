class Solution {
    public int countTrapezoids(int[][] points) {
        final long MOD = 1_000_000_007L; // correct mod
        Map<Integer, Integer> freq = new HashMap<>();

        for (int[] p : points) {
            freq.put(p[1], freq.getOrDefault(p[1], 0) + 1);
        }

        long sum = 0L;    // Σ comb % MOD
        long sumSq = 0L;  // Σ (comb^2 % MOD)

        for (int c : freq.values()) {
            if (c >= 2) {
                long comb = (long) c * (c - 1) / 2;
                long combMod = comb % MOD;                    // reduce first
                sum = (sum + combMod) % MOD;
                sumSq = (sumSq + (combMod * combMod) % MOD) % MOD; // safe multiplication
            }
        }

        long res = (sum * sum % MOD - sumSq + MOD) % MOD;
        long inv2 = (MOD + 1) / 2; // modular inverse of 2 when MOD is prime
        res = res * inv2 % MOD;

        return (int) res;
    }
}