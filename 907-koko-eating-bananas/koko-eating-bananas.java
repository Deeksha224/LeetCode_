class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int start = 1;
        int end = Integer.MAX_VALUE;
        int ans = 0;

        while (start <= end){
            int mid = start+(end-start)/2;
            if (isPossible(piles,mid,h)){
                end = mid-1;
                ans = mid;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }
    public boolean isPossible(int[] piles, int mid, int h){
        int count = 0;
        for (int pile: piles){
            count += pile/mid;
            if (pile%mid!=0) count++;
        }
        return count <= h;
    }
}