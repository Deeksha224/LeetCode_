// Last updated: 8/6/2025, 11:04:05 AM
class Solution {
    public String concatHex36(int n) {
        
        int sq = n * n;
        int cube = n * n * n;

        // Step 2: Convert to base-16 (hexadecimal) and base-36 (hexatrigesimal)
        String base16 = Integer.toString(sq, 16).toUpperCase();
        String base36 = Integer.toString(cube, 36).toUpperCase();

        return base16 + base36;
    }
}
