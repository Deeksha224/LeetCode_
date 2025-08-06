// Last updated: 8/6/2025, 11:06:48 AM
class Solution {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        String s1 = "";
        s1 = s.substring(0,s.length()/2);
        String s2 = "";
        s2 = s.substring(s.length()/2,s.length());
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        char[] vowels = {'a','e', 'i', 'o', 'u'};
        int count1 = 0;
        int ind1 = 0;
        while (ind1 < arr1.length){
            for (int i = 0; i < vowels.length; i++){
                if (arr1[ind1] == vowels[i]){
                    count1++;
                }
            }
            ind1++;
        }
        int count2 = 0;
        int ind2 = 0;
        while (ind2 < arr2.length){
            for (int i = 0; i < vowels.length; i++){
                if (arr2[ind2] == vowels[i]){
                    count2++;
                }
            }
            ind2++;
        }
        if (count1 == count2){
            return true;
        }
        return false;
    }
}