class Solution {
    public int numSplits(String s) {
        int[] left = new int[26];
        int[] right = new int[26];
        for(char c : s.toCharArray()){
            right[c-'a']++;
        }
        int leftDist = 0;
        int rightDist = 0;

        for(int i = 0; i < 26; i++){
            if(right[i]>0){
                rightDist++;
            }
        }
        int count = 0;
        for(int i = 0; i < s.length()-1; i++){
            int c = s.charAt(i)-'a';
            if(left[c]==0){
                leftDist++;
            }
            left[c]++;

            right[c]--;
            if(right[c] == 0){
                rightDist--;
            }
        if(leftDist == rightDist) count++;
        }
        return count;
    }
   
}