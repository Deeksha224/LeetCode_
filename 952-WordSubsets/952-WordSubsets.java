// Last updated: 8/6/2025, 11:08:00 AM
class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] max_freq = new int[26];
        for (String word : words2){
            int[] freq = new int[26];
            for (char c : word.toCharArray()){
                freq[c-'a']++;
            }
            for (int i = 0; i < 26; i++){
                max_freq[i] = Math.max(max_freq[i],freq[i]);
            }
            
        } 
        ArrayList<String> list = new ArrayList<>();
        for (String word : words1){
            int[] freq = new int[26];
            for (char c : word.toCharArray()){
                freq[c-'a']++;
            }
            if (isValid(freq,max_freq)){
                list.add(word);
            }
        }
        return list;
    }

    public boolean isValid(int[] freq, int[] max_freq){
        for (int i = 0; i < 26; i++){
            if (freq[i] < max_freq[i]){
                return false;
            }
        }
        return true;
    }
}