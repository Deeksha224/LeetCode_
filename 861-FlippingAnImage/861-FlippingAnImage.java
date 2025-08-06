// Last updated: 8/6/2025, 11:08:20 AM
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for (int[] row : image){
            // reverse the array
            for (int i = 0; i < (n + 1)/2; i++){
                // swapping the first and last while taking Xor for changing the digit
                int temp = row[i] ^ 1;
                row[i] = row[(n - i - 1)] ^ 1;
                row[(n-i-1)] = temp;
            }
        }
        return image;
    }
}