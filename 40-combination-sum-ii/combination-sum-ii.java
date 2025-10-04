class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> li = new ArrayList<>();
        Arrays.sort(candidates);
        answer(candidates,target,new ArrayList<>(), li,0);
        return li;
    }
    public void answer(int[] candidates , int target, List<Integer> ans , List<List<Integer>> li, int ind){
        if(target==0){
            if(!li.contains(ans)){
                li.add(new ArrayList<>(ans));
            }
            return;
        }
        for(int i=ind ; i<candidates.length ; i++){
            if(target-candidates[i]<0){
                continue;
            }
            if(i>ind && candidates[i]==candidates[i-1]){
                continue;
            }
            if(candidates[i]<=target){
                ans.add(candidates[i]);
                answer(candidates,target-candidates[i],ans,li,i+1);
                ans.remove(ans.size()-1);
            }
        }
    }
}