class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] arr = new int[intervals.length+1][1];
        int t = 0;
        for(int[] a:intervals){
            arr[t++] = a;
        }
        arr[t] = newInterval;
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        ArrayList<int[]> ans = new ArrayList<>();
        for(int[] inter : arr){
            if(ans.size() == 0 || ans.get(ans.size()-1)[1] < inter[0]){
                ans.add(inter);
            }
            else{
                ans.get(ans.size()-1)[1] = Math.max(ans.get(ans.size()-1)[1],inter[1]);
            }
        }
        return ans.toArray(new int[ans.size()-1][1]);
    }
}