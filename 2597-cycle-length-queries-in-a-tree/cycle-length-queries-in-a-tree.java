class Solution {
    public int[] cycleLengthQueries(int n, int[][] queries) {
        int count = 1;
        int[] arr = new int[queries.length];
        for(int i = 0; i < queries.length; i++){
            int a = queries[i][0];
            int b = queries[i][1];
            while (a != b) {
                if (a > b) {
                    a /= 2;
                } else {
                    b /= 2;
                }
                count++;
            }
            arr[i] = count;
            count=1;
        }

        return arr;
    }
}