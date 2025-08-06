// Last updated: 8/6/2025, 11:12:05 AM
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> li = new ArrayList<>();
        permute(candidates,target,new ArrayList<>(),0,li);
        return li;
    }
    public static void permute(int[] coin, int amount, List<Integer> ans,int ind ,List<List<Integer>> li ){
        if(amount==0){
            li.add(new ArrayList(ans));
            return;
        }
        for(int i=ind ; i<coin.length ; i++){
            if(amount>=coin[i]){
                ans.add(coin[i]);
                permute(coin, amount-coin[i], ans,i,li);
                ans.remove(ans.size()-1);
            }
        }
    }
}