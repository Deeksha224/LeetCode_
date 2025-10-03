class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0;
        int sumB = 0;
        for (int a : aliceSizes){
            sumA += a;
        }
        for (int b : bobSizes){
            sumB += b;
        }
        int dif = (sumB - sumA)/2;
        HashSet<Integer> set = new HashSet<>();
        for (int b : bobSizes){
            set.add(b);
        }

        for (int a : aliceSizes){
            int temp = a+dif;
            if (set.contains(temp)){
                return new int[]{a,temp};
            }
        }
        return new int[]{};
    }
}