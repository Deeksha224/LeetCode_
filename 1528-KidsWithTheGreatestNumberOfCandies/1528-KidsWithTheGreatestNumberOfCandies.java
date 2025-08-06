// Last updated: 8/6/2025, 11:07:14 AM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        ArrayList<Boolean> ans = new ArrayList<>(candies.length);

        for (int candii:candies){
            if (max < candii){
                max = candii;
            }
        }
        for (int candii:candies){
            if (candii + extraCandies >= max){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }
}