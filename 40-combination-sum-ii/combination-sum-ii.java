class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(candidates);
        fun(candidates,target,0,ans,res);
        return res;

    }
    public void fun(int[] can, int target, int idx, List<Integer> ans, List<List<Integer>> res){
        
        if(target== 0){
            res.add(new ArrayList(ans));
            //System.out.println(ans);
            return;
        }
        for(int i = idx; i < can.length; i++){
            
            if(target >= can[i]){
                if(i > idx && can[i] == can[i-1]){
                    continue;
                }
                ans.add(can[i]);
                fun(can,target-can[i],i+1,ans,res);
                ans.remove(ans.size()-1);
            }
            
        }
        
        
    }
}