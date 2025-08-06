// Last updated: 8/6/2025, 11:07:12 AM
class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList();
        int i = 1;
        for (int num : target){
            while (i < num){
                ans.add("Push");
                ans.add("Pop");
                i++;
            }
            ans.add("Push");
            i++;
        }
        return ans;
    }
}