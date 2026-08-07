class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        fun(candidates,target,0,ans,res);
        return res;

    }
    public void fun(int[] can, int target, int idx, List<Integer> ans, List<List<Integer>> res){
        if(target == 0){
            res.add(new ArrayList(ans));
            return;
        }
        for(int i = idx; i < can.length; i++){
            if(target>= can[i]){
                ans.add(can[i]);
                fun(can,target-can[i],i,ans,res);
                ans.remove(ans.size()-1);
            }
        }
    }
}