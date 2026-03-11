class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        int bit = 32-Integer.numberOfLeadingZeros(n);
        int mask = (1<<bit)-1;
        return ~n & mask;
    }
}