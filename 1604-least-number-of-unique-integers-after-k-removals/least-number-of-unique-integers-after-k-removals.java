class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int a : arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);

        int count = map.size();
        for (int c : list){
            if (k >= c){
                k-=c;
                count--;
            }
            else{
                break;
            }
        }
        return count;
    }
}