// Last updated: 8/6/2025, 11:04:11 AM
class Solution {
    public int minDeletion(String s, int k) {
        int[] f = new int[26];
        for (int i = 0; i < s.length(); i++){
            int ch = s.charAt(i);
            f[ch-'a']++;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 26; i++){
            if (f[i] > 0){
                arr.add(f[i]);
            }
        }
        if (arr.size() <= k){
            return 0;
        }
        Collections.sort(arr);

        int ans = 0;
        int index = arr.size()-k;
        for (int i = 0; i < index; i++){
            ans += arr.get(i);
        }
        return ans;
    }
}