class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++){
            ans[i] = 1;
        }

        for (int i = 1; i < n; i++){ //left search
            if (ratings[i] > ratings[i-1]){
                ans[i] = ans[i-1]+1;
            }
        }

        for (int i = ratings.length-2; i >=0; i--){ //right search
            if (ratings[i] > ratings[i+1]){
                ans[i] = Math.max(ans[i] , ans[i+1]+1);
            }
        }

        int total = 0;
        for (int a : ans){
            total+=a;
        }
        return total;
    }
}