// Last updated: 8/6/2025, 11:06:35 AM
class Solution {
    public String sortSentence(String str) {
       String[] ans = new String[str.length()];
        str = str.trim();
        String[] arr = str.split(" ");
        for (String word : arr){
            int len = word.length();
            int index = (int)word.charAt(len - 1) - '0';
            ans[index - 1] = word.substring(0, len - 1);
        }
        String result = "";
        result = ans[0];
        for (int i = 1; i < arr.length; i++){
            result += " " + ans[i];
        }
        return result;
    }
}