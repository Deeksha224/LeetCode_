// Last updated: 8/6/2025, 11:04:49 AM
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] ans = new int[2];
        int[] store = new int[n*n];
        int a = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                store[a] = grid[i][j];
                a++;
            }
        }
        Arrays.sort(store);
        boolean flag = true;
        for (int i = 0; i < store.length - 1; i++){
            if (store[i] == store[i+1]){
                ans[0] = store[i];
                break;
            }
        }
        for (int i = 0; i < store.length - 1; i++){
            if ((store[i] + 1) == store[i+1] || store[i] == store[i+1]){
                continue;
            }
            else{
                ans[1] = store[i] + 1;
                flag = false;
                break;
            }
        }
        if (store[0] != 1){
            ans[1] = 1;
            flag = false;
        }
        if (flag){
            ans[1] = store[store.length - 1] + 1;
        }
        return ans;
    }
}