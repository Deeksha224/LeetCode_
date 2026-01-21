class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        int xor1 = arr2[0];
        for (int i = 1; i < arr2.length; i++){
            xor1 ^= arr2[i];
        }
        int xor2 = arr1[0];
        for (int i = 1; i < arr1.length; i++){
            xor2 ^= arr1[i];
        }
        return xor1&xor2;

    }
}