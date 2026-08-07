class Solution {
    public int beautySum(String s) {
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            int[] freq = new int[26];
            for(int j = i; j < s.length(); j++){
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                freq[s.charAt(j)-'a']++;

                for(int f:freq){
                    if(f>0){
                        min = Math.min(min,f);
                        max = Math.max(max,f);
                    }
                }
                ans += (max-min);
            }
        }
        return ans;
    }
}