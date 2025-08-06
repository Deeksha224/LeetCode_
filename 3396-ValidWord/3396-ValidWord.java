// Last updated: 8/6/2025, 11:04:41 AM
class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3){
            return false;
        }
        boolean vowel = false;
        boolean consonant = false;
        for (char c : word.toCharArray()){
            if (Character.isLetter(c)){
                char ch = Character.toLowerCase(c);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowel = true;
                }
                else{
                    consonant = true;
                }
            }
            else if (!Character.isDigit(c)){
                return false;
            }
        }
        return vowel && consonant;
    }
}