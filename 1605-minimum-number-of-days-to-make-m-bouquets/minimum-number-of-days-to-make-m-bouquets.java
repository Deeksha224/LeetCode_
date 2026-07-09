class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length < m*k){
            return -1;
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < bloomDay.length; i++){
            if(max<bloomDay[i]){
                max = bloomDay[i];
            }
        }
        int start = 0;
        int end = max;
        int ans = Integer.MAX_VALUE;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(helper(bloomDay, m, k, mid)){
                ans = Math.min(ans,mid);
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        if(ans == Integer.MAX_VALUE) return -1;
        return ans;
    }
    public boolean helper(int[] bloomday, int m, int k, int mid){
        int count = 0;
        for(int i = 0; i < bloomday.length; i++){
            if(bloomday[i] <= mid){
                count++;
                if(count == k){
                    m--;
                    count = 0;
                }
            }
            else count = 0;
        }
        return m<=0;
    }
}