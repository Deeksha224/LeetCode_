// Last updated: 8/6/2025, 11:06:37 AM
class Solution {
    public boolean checkIfPangram(String sentence) {
        char[] arr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] sen = sentence.toCharArray();
        Arrays.sort(sen);
        Arrays.sort(arr);
        String str = "";
        str += sen[0];
        for (int i = 1; i < sen.length; i++){
            if (sen[i] != sen[i - 1]){
                str += sen[i];
            }
        }
        char[] sen1 = str.toCharArray();
        return (Arrays.equals(sen1,arr));
    }
}