// Last updated: 8/6/2025, 11:09:11 AM
class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        int maxlength = 0;
        String ans = "";

        for (int i = 0; i < dictionary.size(); i++){
            int length = check(s,dictionary.get(i));

            if (length > maxlength || (length == maxlength && ans.compareTo(dictionary.get(i)) > 0)){
                maxlength = length;
                ans = dictionary.get(i);
            }
        }
        return ans;
    }
    public int check(String s, String word){
        int j = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == word.charAt(j)){
                j++;
                if (j == word.length()){
                    return j;
                }
            }
        }
        
        return 0;
    }
}