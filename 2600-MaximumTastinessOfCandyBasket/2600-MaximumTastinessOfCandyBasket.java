// Last updated: 8/6/2025, 11:05:10 AM
class Solution {
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int low = 0;
        int high = price[price.length - 1];
        int ans = -1;

        while (low <= high){
            int mid = low + (high-low)/2;
            if (isValid(mid,price,k)){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
    public boolean isValid(int mid, int[] price, int k){
        int temp = price[0];
        int count = 1;
        for (int i = 1; i < price.length; i++){
            if (price[i] - temp >= mid){
                count++;
                temp = price[i];
            }
        }
        return (count >= k);
    }
}